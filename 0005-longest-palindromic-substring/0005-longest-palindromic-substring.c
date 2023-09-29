char * longestPalindrome(char * s){
    int n = strlen(s);
    if(n <= 1) return s;
    int dp[n][n];
    memset(dp, 0, sizeof(dp));
    int start = 0;
    int max_len = 1;
    for(int i = 0; i < n; i++){
        dp[i][i] = 1;
    }
    for(int i = 0; i < n - 1; i++){
        if(s[i] == s[i + 1]){
            dp[i][i + 1] = 1;
            start = i;
            max_len = 2;
        }
    }
    for(int len = 3; len <= n; len++){
        for(int i = 0; i < n - len + 1; i++){
            int j = i + len - 1;
            if(s[i] == s[j] && dp[i + 1][j - 1]){
                dp[i][j] = 1;
                if(len > max_len){
                    start = i;
                    max_len = len;
                }
            }
        }
    }
    char * result = malloc(sizeof(char) * (max_len + 1));
    strncpy(result, s + start, max_len);
    result[max_len] = '\0';

    return result;
}