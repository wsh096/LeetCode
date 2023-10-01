int max(int a, int b) {
    return a > b ? a : b;
}

int min(int a, int b) {
    return a < b ? a : b;
}

int maxArea(int* height, int heightSize){
    int answer = 0, left = 0, right = heightSize - 1;
    while(left < right){
        int current = min(height[left], height[right]);
        answer = max(answer, current * (right - left));
        if(height[left] < height[right]){
            left++;
        }else{
            right--;
        }
    }
    return answer;
}