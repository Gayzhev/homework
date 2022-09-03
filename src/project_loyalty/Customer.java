package project_loyalty;

public class Customer {
    private String name;
    private String memberType;
    private boolean isMember;

    public Customer() {
    }
    public Customer(String name, String memberType, boolean isMember) {
        this.name = name;
        this.memberType = memberType;
        this.isMember = isMember;
    }
    public String getName() {
        return name;
    }
    public String getMemberType() {
        return memberType;
    }
    public boolean getIsMember() {
        return true;      // ошибка. неправильно использую boolean
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
    public boolean setIsMember(boolean isMember) { //проблема
        this.isMember = isMember;
        return isMember;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", memberType='" + memberType + '\'' +
                ", memberShip=" + isMember +
                '}';
    }
}

