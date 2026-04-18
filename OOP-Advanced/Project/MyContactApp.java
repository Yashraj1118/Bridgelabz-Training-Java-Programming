// My Contacts App with users register, log in, and manage contacts (create, view,
// search, edit, delete). Supports tagging, notes, and optional sync/backup/export.

import java.util.*;
class Contact{
    String id;
    String password;
    String name;
    String phone;
    String email;
    String address;
    String notes;

    public Contact(String id,String password ,String name,String phone,String email, String address, String notes){
        this.name=name;
        this.phone=phone;
        this.email=email;
        this.address=address;
        this.notes=notes;
        this.id=id;
        this.password=password;

    }
    
    boolean login(String id, String password){
        return this.id.equals(id) && this.password.equals(password);
    }

    void showDetails(){
        System.out.println("\n----- CONTACT DETAILS -----");
        System.out.println("Name    : " + name);
        System.out.println("Phone   : " + phone);
        System.out.println("Email   : " + email);
        System.out.println("Address : " + address);
        System.out.println("Notes   : " + notes);
    }



}

public class MyContactApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Contact contact=null;
        int choice;

        while(true){
            System.out.println("----- MY CONTACTS APP -----");
            System.out.println("1. Create Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Edit Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.println("Enter your Choice: ");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter ID: ");
                    String id=sc.nextLine();
                    System.out.println("Enter Password: ");
                    String password=sc.nextLine();
                    System.out.println("Enter Name: ");
                    String name=sc.nextLine();
                    System.out.println("Enter Phone: ");
                    String phone=sc.nextLine();
                    System.out.println("Enter Email: ");
                    String email=sc.nextLine();
                    System.out.println("Enter Address: ");
                    String address=sc.nextLine();
                    System.out.println("Enter Notes: ");
                    String notes=sc.nextLine();

                    contact=new Contact(id,password,name,phone,email,address,notes);
                    System.out.println("Contact Created Successfully!\n");
                    break;

                case 2:
                    if(contact!=null){
                        System.out.println("Enter Id: ");
                        String viewId=sc.nextLine();
                        System.out.println("Enter password: ");
                        String viewPass=sc.nextLine();
                        if(contact.login(viewId,viewPass)){
                            contact.showDetails();
                        }
                    }else{
                        System.out.println("No contact found. Please create a contact first.\n");
                    }
                    break;

                case 3:
                    System.out.println("Search by NAME: ");
                    String searchName=sc.nextLine();
                    if(contact != null && contact.name.equals(searchName)){
                        System.out.println("Contact Found!");
                        contact.showDetails();
                    }else{
                        System.out.println("Contact not found!\n");
                    }
                    break;
                case 4:
                    if(contact!=null){
                        System.out.println("Enter Id: ");
                        String editId=sc.nextLine();
                        System.out.println("Enter password: ");
                        String editPassword=sc.nextLine();
                        if(contact.login(editId,editPassword)){
                            System.out.println("Enter the new name: ");
                            contact.name=sc.nextLine();
                            System.out.println("Enter the new Phone number: ");
                            contact.phone=sc.nextLine();
                            System.out.println("Enter the new email: ");
                            contact.email=sc.nextLine();
                            System.out.println("Enter the new address: ");
                            contact.address=sc.nextLine();
                            System.out.println("Enter the new notes: ");
                            contact.notes=sc.nextLine();
                            System.out.println("Contact Details Updated Successfully" +"\n");

                        }
                        else{
                            System.out.println("Inavalid Credentials" + "\n");
                        }
                    }else{
                        System.out.println("No contact found. Please create a contact first.\n");
                    }
                    break;
                case 5:
                    if(contact!=null){
                        System.out.println("Enter Id: ");
                        String deleteId=sc.nextLine();
                        System.out.println("Enter Passsword: ");
                        String deletePassword=sc.nextLine();
                        if(contact.login(deleteId, deletePassword)){
                            contact=null;
                            System.out.println("Contact deleted ");

                        }
                        else{
                            System.out.println("Invalid Credentials" + "\n");
                        }
                    }
                    else{
                        System.out.println("No contact found " );
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
               
                default:
                    System.out.println("Invalid choice! Please try again.\n");
            }
        }
    }
}
