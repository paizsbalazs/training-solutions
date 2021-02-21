package week04d01;

public class NameChanger {

    private String fullName;

    public NameChanger(String fullName) {
        if (fullName == "") {
            System.out.println("Invalid Name: " + fullName);
        } else {
            this.fullName = fullName;
        }
    }

    public String getFullName() {
        return this.fullName;
    }

    public void changeFirstName(String newName) {
        fullName = this.fullName.substring(0, this.getFullName().indexOf(" ")) + " " + newName;
    }

    //@Test
    //public void crateNameChangerTest() {
    //    IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new NameChanger(""));
    //    assertEquals("Invalid name:", iae.getMessage());
    //}

    //@Test
    //public void isTheSameTest(){
    //    NameChanger nameChanger = new NameChanger("Doe John");
    //    assertEquals(true, nameChanger.isTheSame("Doe John"));
    //    assertTrue( nameChanger.isTheSame("Doe John"));
    //    assertFalse(nameChanger.isTheSame("John Doe"));
    //}
}
