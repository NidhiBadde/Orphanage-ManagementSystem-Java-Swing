/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Adoption;

import Business.Adopter.AdopterDirectory;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Adoption.AdopterOrganization;
import Business.Organization.Adoption.AdoptionOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Adoption.AdoptionCheckRole.AdoptionCheckWorkAreaJPanel;


/**
 *
 * @author Nidhi
 */
public class AdoptionRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory directory, AdopterDirectory udirectory) {
        return new AdoptionCheckWorkAreaJPanel(userProcessContainer, account, organization, enterprise,business, udirectory);
    }
    
    
}
