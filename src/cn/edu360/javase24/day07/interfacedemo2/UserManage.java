package cn.edu360.javase24.day07.interfacedemo2;

public interface UserManage {
    public boolean login(String name, String pwd);
    /**
     *
     * @param name
     * @param pwd
     * @param pwd2
     * @return
     */
    public String register(String name, String pwd, String pwd2);
}
