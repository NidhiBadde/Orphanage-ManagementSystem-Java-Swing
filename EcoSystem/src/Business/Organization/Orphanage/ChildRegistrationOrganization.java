/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Orphanage;

import Business.Child.ChildDirectory;
import Business.Organization.Organization;
import Business.Role.Orphanage.ChildRegistrationRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Nidhi
 */
public class ChildRegistrationOrganization extends Organization {
ChildDirectory directory;
    public ChildRegistrationOrganization() {
        super(Organization.Type.ChildRegistration.getValue());
       // this.directory = super.getChildDirectory(); // Calling the getter method over here so that the same child directory everywhere
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ChildRegistrationRole());
        return roles;
    }
      
//      @Override
//    public ChildDirectory getChildDirectory(){
//        ChildDirectory directory = new ChildDirectory();
//        directory.addChild();
//        return directory;
//    }
    
    }

   

