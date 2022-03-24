#include<iostream>
#include<cstdio>
#include<cstdlib>
#include<algorithm>
#include<cmath>
#include<cstring>
#include<map>
using namespace std;
int main(){
    map<string,int>mp;
    map<string,int>::iterator it;
    int n;
    long long sum=0,ans=0;
    string s;
    char c='!';
    cin>>n;
    for(int i=0;i<n;i++)
    while(n--){
        cin>>s;
        mp[s]++;
    }

    for(it=mp.begin();it!=mp.end();it++){
        s=it->first;
        n=it->second;
        if(s[0]!=c){
            c=s[0];
            sum=0;
        }
        ans+=sum*n*2;
        sum+=n;
    }
    cout<<ans<<endl;
    return 0;
}