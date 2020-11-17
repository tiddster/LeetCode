public class T6 {
    public static void main(String[] args) {
        NetUser Monster = new NetUser(2020213482,"monster123456");
        System.out.print("ID:"+Monster.getID()+"\n"+
                "Number:"+Monster.getNumber()+"\n"+
                "Email:"+Monster.getEmail()+"\n");
    }
}

class NetUser{
    private int ID;
    private String Number;
    private String Email;

    public NetUser(int ID,String Number){
        this.ID = ID;
        this.Number = Number;
        this.Email = ID+"@gameschool.com";
    }

    public String getNumber() {
        return Number;
    }

    public int getID() {
        return ID;
    }

    public String getEmail() {
        return Email;
    }
}