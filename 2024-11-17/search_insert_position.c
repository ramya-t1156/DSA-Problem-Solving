int searchInsert(int* nums, int numsSize, int target) {
    for(int i=0;i<numsSize;i++){
        if(*(nums+i)==target){
            return i;
        }
    }
    for(int j=0;j<numsSize;j++){
        if(*(nums+j)>target){
            return j;
        }
    }
    return numsSize;
}
