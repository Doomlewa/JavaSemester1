package lab5q1;

public class Name {

    private String firstName;
    private String middleName;
    private String lastName;
    
    public Name(String first, String middle, String last)
    {
        firstName=first;
        middleName=middle;
        lastName=last;
    }

    public String getLastName() {
        return lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }
    
    public String firstMiddleLast(){
        String fullName;
        fullName=firstName+" "+middleName+" "+lastName;
        return fullName;
    }
    
    public String lastFirstMiddle(){
        String fullName;
        fullName=lastName+", "+firstName+" "+middleName;
        return fullName;
    }
    
    public boolean equals(Name otherName){

        Name name1 = otherName;
        String fullName1 = name1.getFirstName() + name1.getMiddleName() + name1.getLastName();
        String fullName2 = firstName + middleName + lastName;
        if (fullName1.equalsIgnoreCase(fullName2))
        {
               return true;
        }
        else
        {
         return false;
        }
    }
    public String initials()
    {
        String firstInit=firstName.substring(0, 1);
        String midInit=middleName.substring(0, 1);
        String lastInit=lastName.substring(0, 1);
        firstInit=firstInit.toUpperCase()+".";
        midInit=midInit.toUpperCase()+".";
        lastInit=lastInit.toUpperCase()+".";
        String fullInitials=firstInit+midInit+lastInit;
        return fullInitials;
    }
    public int length()
    {
        String name=firstName+middleName+lastName;
        int nameLength=name.length();
        return nameLength;
    }
}
