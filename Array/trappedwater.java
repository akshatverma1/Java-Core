class trapedwater {
    public static void main(String arr[]) {
        int heigth[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedwater(heigth));
    }

    public static int trappedwater(int heigth[]) {
        int n = heigth.length;
        int water = 0;
        // calculate the left max boundary
        int leftBoundary[] = new int[heigth.length];
        leftBoundary[0] = heigth[0];
        for (int i = 1; i < leftBoundary.length; i++) {
            leftBoundary[i] = Math.max(leftBoundary[i - 1], heigth[i]);
        }

        // calculate the Right max boundary
        int rigthBoundary[] = new int[heigth.length];
        rigthBoundary[rigthBoundary.length - 1] = heigth[n - 1];
        for (int j = rigthBoundary.length - 2; j >= 0; j--) {
            rigthBoundary[j] = Math.max(heigth[j], rigthBoundary[j + 1]);
        }
        // loop

        for (int i = 0; i < heigth.length; i++) {
            int trappedwater = Math.min(rigthBoundary[i], leftBoundary[i]);
            int savedWater = trappedwater - heigth[i];
            water += savedWater;
        }

        return water;
    }
}