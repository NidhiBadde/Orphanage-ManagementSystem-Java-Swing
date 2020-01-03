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
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import userinterface.Adoption.FinanceCheckRole.FinanceCheckProcessRequestJPanel;
import userinterface.Adoption.FinanceCheckRole.FinanceCheckWorkAreaJPanel;

/**
 *
 * @author Nidhi
 */
public class FinanceRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory directory, AdopterDirectory udirectory) {
        
        return new FinanceCheckWorkAreaJPanel(userProcessContainer,account, organization, enterprise,  business,  udirectory);
    }
}
