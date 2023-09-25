int lengthOfLongestSubstring(char * s){
    int chars[128], idx = 128;
    while (idx--) chars[idx] = -1;

    int start = -1, length = 0, localLength;
    size_t c;
    while(s[++idx] != '\0') {
        c = (size_t) s[idx];
        if(chars[c] > start) start = chars[c];

        localLength = idx - start;
        if(length < localLength) length = localLength;
        chars[c] = idx; 
    }
    return (start > -1 ? length : idx);
}