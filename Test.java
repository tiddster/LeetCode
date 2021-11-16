public class Test {
    public static void main(String[] args) {
        MilkCake cake = new MilkCake(100,5);
    }

    static class Cake{
        int sizeOfCake;

        //构造器，函数名必须和类名一致
        public Cake(int size){
            sizeOfCake = size;    //用于定义初始化对象的代码内容---sizeOfCake
        }

        public Cake(){}
        void shape(){
            System.out.println("双层");
        }
        void setSize(int size){
            sizeOfCake = size;
        }
        void beEaten(){
            sizeOfCake = 0;
        }
    }

    static class MilkCake extends Cake{
        int priceOfMilkCake;

        public MilkCake(int price, int size){
            super(size);
            priceOfMilkCake = price;
        }

        void shape(){
            super.shape();
            System.out.println("圆形");
        }

        void setPrice(int price){
            priceOfMilkCake = price;
        }

        int getPrice(){
            return priceOfMilkCake;
        }
    }
}
