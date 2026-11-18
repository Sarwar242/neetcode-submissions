class Solution {
public:
    bool isAnagram(string s, string t) {
       unordered_map<char,int> x,y;
       if(s.size()!=t.size()) return false;
       for(int i=0; i<s.size(); i++) 
         x[s[i]]++;
       for(int i=0; i<t.size(); i++) 
         x[t[i]]--; 

       for(auto a:x){
        if(a.second!=0) return false;
       }

       return true;
    }
};
