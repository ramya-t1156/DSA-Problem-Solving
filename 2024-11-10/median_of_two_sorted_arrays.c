double findMedianSortedArrays(int* nums1, int n1s, int* nums2, int n2s) {
    int total = n1s + n2s;
    double *result = (double*) malloc(total * sizeof(double));
    int k = total - 1;
    int i = n1s - 1;
    int j = n2s - 1;

    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            result[k--] = nums1[i--];
        } else {
            result[k--] = nums2[j--];
        }
    }

    while (i >= 0) {
        result[k--] = nums1[i--];
    }
    while (j >= 0) {
        result[k--] = nums2[j--];
    }

    double median;
    if (total % 2 == 0) {
        median = (result[total / 2 - 1] + result[total / 2]) / 2.0;
    } else {
        median = result[total / 2];
    }
    free(result);
    return median;
}
