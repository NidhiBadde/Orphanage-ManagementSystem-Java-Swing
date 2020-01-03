/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Child;
/*
Sid - 
Child class which is the basic entity of the system. All the details are related to the child
such as name, id, status, image details identification mark etc

*/
import java.util.Date;

/**
 *
 * @author rao.sid
 */
public class Child {
    int childId;
    String childname;
    int childAge;
    String status;
    String imageDetails;
    String identificationMark;
    String childGender;
    private static int count=1;
    Date registrationDate;
    String medicalStatus;
     private double BP;
    private double pulseRate;
    private double respirationRate;
    private double bodytemp;
    
    
    private boolean bed;
    private boolean table;
    private boolean closet;

    public double getBP() {
        return BP;
    }

    public void setBP(double BP) {
        this.BP = BP;
    }

    public double getPulseRate() {
        return pulseRate;
    }

    public boolean isBed() {
        return bed;
    }

    public void setBed(boolean bed) {
        this.bed = bed;
    }

    public boolean isTable() {
        return table;
    }

    public void setTable(boolean table) {
        this.table = table;
    }

    public boolean isCloset() {
        return closet;
    }

    public void setCloset(boolean closet) {
        this.closet = closet;
    }

    
    
    public void setPulseRate(double pulseRate) {
        this.pulseRate = pulseRate;
    }

    public double getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(double respirationRate) {
        this.respirationRate = respirationRate;
    }

    public double getBodytemp() {
        return bodytemp;
    }

    public void setBodytemp(double bodytemp) {
        this.bodytemp = bodytemp;
    }
    
    

    public String getMedicalStatus() {
        return medicalStatus;
    }

    public void setMedicalStatus(String medicalStatus) {
        this.medicalStatus = medicalStatus;
    }

    

    public String getChildGender() {
        return childGender;
    }

    public void setChildGender(String childGender) {
        this.childGender = childGender;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Child.count = count;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getIdentificationMark() {
        return identificationMark;
    }

    public void setIdentificationMark(String identificationMark) {
        this.identificationMark = identificationMark;
    }

    public int getChildId() {
        System.out.println("get kar rha hu child id: "+childId);
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }

    public String getChildname() {
        return childname;
    }

    public void setChildname(String childname) {
        this.childname = childname;
    }

    public int getChildAge() {
        return childAge;
    }

    public void setChildAge(int childAge) {
        this.childAge = childAge;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImageDetails() {
        return imageDetails;
    }

    public void setImageDetails(String imageDetails) {
        this.imageDetails = imageDetails;
    }

//    public Child(int childId, String childname, int childAge, String status, String imageDetails, String identificationMark, Date registrationDate, String childGender) {
//        this.childId = count;
//        this.childname = childname;
//        this.childAge = childAge;
//        this.status = status;
//        this.imageDetails = imageDetails;
//        this.identificationMark=identificationMark;
//        this.registrationDate = registrationDate;
//        this.childGender = childGender;
//        count++;
//          
//}
//    public Child(){
//        
//        System.out.println("count before: "+count);
//        childId = count;
//        count++;
//        System.out.println("count after: "+count);
//        
//    }
    
    @Override
    public String toString(){
        return String.valueOf(childId);
    }
}
