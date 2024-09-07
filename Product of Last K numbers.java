class ProductOfNumbers {
    List<Integer> L;
    public ProductOfNumbers() {
        L=new ArrayList<>();
    }
    
    public void add(int num) {
        L.add(num);
    }
    
    public int getProduct(int k) {
        int f=1;
        int Count=0;
        for(int i=L.size()-1;i>=0;i--)
        {
            if(Count<k)
            {
            f=f*L.get(i);
            Count++;
            }
        }
        return f;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
