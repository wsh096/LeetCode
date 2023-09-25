func lengthOfLongestSubstring(s string) int {
    answer := 0
    start := 0
    charMap := make(map[byte]int)
    c := []byte(s)

    for end := 0; end < len(c); end++ {
        if val, ok := charMap[c[end]]; ok {
            start = max(start, val + 1)
        }
        answer = max(answer, end - start + 1)
        charMap[c[end]] = end
    }
    return answer
}

func max(a, b int) int {
    if a > b {
        return a
    }
    return b
}