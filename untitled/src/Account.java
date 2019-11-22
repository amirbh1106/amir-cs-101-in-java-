public class Account {
    public int num;
    public double balacnce, overdraftLimit;
    public boolean active;

    public void printAccountNumber()
    {
        System.out.println(num);
    }

    public void datailList()
    {
        System.out.println(num + "," + balacnce + "," + overdraftLimit + "," + active + ",");
    }
}
