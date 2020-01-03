/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Adoption;

import Business.Organization.Organization;
import Business.Role.Adoption.AdoptionAdminRole;
import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author Nidhi
 */
public class AdoptionAdminOrganization extends Organization {

    public AdoptionAdminOrganization(String name) {
        super(Type.AdoptionAdmin.getValue());
    }

   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdoptionAdminRole());
        return roles;
    }
    
}
