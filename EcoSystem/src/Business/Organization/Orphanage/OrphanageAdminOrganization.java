/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Orphanage;

import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.Role.Orphanage.OrphanageAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Nidhi
 */
public class OrphanageAdminOrganization extends Organization{

    public OrphanageAdminOrganization() {
        super(Organization.Type.OrphanageAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OrphanageAdminRole());
        return roles;
    }
     
}


