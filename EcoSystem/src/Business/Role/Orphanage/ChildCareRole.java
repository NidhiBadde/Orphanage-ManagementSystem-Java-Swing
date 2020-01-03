/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Orphanage;

import Business.Adopter.AdopterDirectory;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.ChildCare;
import Business.Organization.Orphanage.ChildCareOrganization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import userinterface.Orphanage.ChildCare.ChildCareWorkAreaJPanel;

/**
 *
 * @author Nidhi
 */
public class ChildCareRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory directory, AdopterDirectory udirectory) {
       
        return new ChildCareWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business, directory, udirectory);
    }
}
