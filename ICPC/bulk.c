#include<iostream> #include<cstdio> #include<cstdlib> #include<cstring> #include<cmath> #include<algorithm> #include<vector> #define rep(i,a,b) for(int i=a;i<=b;i++) #define dep(i,a,b) for(int i=a;i>=b;i--) #define mem(x,num) memset(x,num,sizeof x) #define ll long long #define reg(i,x) for(int i=last[x];i;i=e[i].next) using namespace std;
inline ll read(){
    ll f=1,x=0;char ch=getchar();
    while(ch<'0'||ch>'9'){if(ch=='-')f=-1;ch=getchar();}
    while(ch>='0'&&ch<='9'){x=x*10+ch-'0';ch=getchar();}
    return x*f;
}

const int maxn=2e5+6;
const ll inf=1e18;
int n,m,tot,f[maxn];
ll dp[maxn];
vector<int> g[maxn];
struct node{
    int x,y;
    inline bool operator < (const node &u)const{return u.x==x?y<u.y:x<u.x;}
    inline bool operator > (const node &u)const{return ((x>=u.x)&&(y>=u.y));}
}a[maxn];
namespace BIT{
    #define lowbit(x) (x&(-x))     int tree[maxn<<3];
    inline void modifybit(int x,int Val){
        x=max(x,1);
        for(int i=x;i<=m;i+=lowbit(i))tree[i]=max(tree[i],Val);
    }
    inline int querybit(int x){
        int re=0;
        for(int i=x;i;i-=lowbit(i))re=max(re,tree[i]);
        return re;
    }
}
using namespace BIT;
namespace SEG{
    #define ls (x<<1)     #define rs (x<<1|1)     #define mid ((l+r)>>1)     #define MID ((L+R)>>1)     vector<int>p[maxn<<2];
    vector<int>now,s;
    void build(int x,int l,int r){
        p[x]=vector<int>();
        if(l==r)return;
        build(ls,l,mid);build(rs,mid+1,r);
    }
    void init(int x){
        now=g[x];
        build(1,0,now.size()-1);
    }
    void insert(int x,int l,int r,int k){
        if(a[k].x>=a[now[r]].x&&a[k].y>=a[now[l]].y){
            p[x].push_back(k);
            return;
        }
        if(a[k].x<a[now[l]].x||a[k].y<a[now[r]].y||l==r)return;
        insert(ls,l,mid,k);insert(rs,mid+1,r,k);
    }
    void queryseg(int l,int r,int L,int R){
        if(l>r)return;
        ll ans=inf;
        int x=s[mid],pos=0;
        rep(i,L,R){
            ll re=dp[now[i]]+1ll*(a[x].x-a[now[i]].x)*(a[x].y-a[now[i]].y);
            if(re<ans)ans=re,pos=i;
        }
        dp[x]=min(dp[x],ans);
        queryseg(l,mid-1,pos,R);
        queryseg(mid+1,r,L,pos);
    }
    void work(int x,int l,int r){
        if(!p[x].empty()){
            s=p[x];
            queryseg(0,s.size()-1,l,r);
        }
        if(l==r)return;
        work(ls,l,mid);work(rs,mid+1,r);
    }
}
using namespace SEG;
void solve(int x){
    init(x);
    for(int i=0,sz=g[x+1].size(),ssz=g[x].size();i<sz;i++)insert(1,0,ssz-1,g[x+1][i]);
    work(1,0,g[x].size()-1);
}
int main(){
    n=read(),m=read();
    rep(i,1,n)a[i].x=read(),a[i].y=read();
    a[++n]=(node){0,0};
    a[++n]=(node){m,m};
    sort(a+1,a+1+n);
    rep(i,1,n){
        f[i]=querybit(a[i].y)+1;
        modifybit(a[i].y,f[i]);
        tot=max(tot,f[i]);
        g[f[i]].push_back(i);
    }
    rep(i,1,n)dp[i]=1ll*a[i].x*a[i].y;
    rep(i,1,tot-1)solve(i);
    cout<<dp[n]<<endl;
    return 0;
}