/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.nbplugin;

import com.aspose.nbplugin.newproject.AsposeNewProject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "com.aspose.nbplugin.asposenewproject")
@ActionRegistration(
        iconBase = "com/aspose/nbplugin/aspose_prj.png",
        displayName = "#CTL_asposenewproject")
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 150),
    @ActionReference(path = "Toolbars/File", position = 250)
})
@Messages("CTL_asposenewproject=Aspose New Project")
public final class asposenewproject implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
        AsposeNewProject proj = new AsposeNewProject(null, true);
        proj.show();
        
        
    }
}
