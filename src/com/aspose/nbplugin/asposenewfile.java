/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.nbplugin;

import com.aspose.nbplugin.newfile.AsposeNewFile;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "com.aspose.nbplugin.asposenewfile")
@ActionRegistration(
        iconBase = "com/aspose/nbplugin/aspose_file.png",
        displayName = "#CTL_asposenewfile")
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 300),
    @ActionReference(path = "Toolbars/File", position = 150)
})
@Messages("CTL_asposenewfile=Aspose New File")
public final class asposenewfile implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
         AsposeNewFile file = new AsposeNewFile(null, true);
        file.show();

    }
}
