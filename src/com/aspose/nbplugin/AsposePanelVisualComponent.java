/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.nbplugin;

import com.aspose.nbplugin.utils.AsposeConstants;
import com.aspose.nbplugin.utils.AsposeJavaComponent;
import com.aspose.nbplugin.utils.AsposeJavaComponents;
import java.awt.Color;
import javax.swing.JPanel;
import org.openide.WizardDescriptor;
import org.openide.WizardValidationException;
/**
 * @author Shoaib Khan
 */
public class AsposePanelVisualComponent extends JPanel
{

    private AsposeWizardPanelComponent panel;

    public AsposePanelVisualComponent(AsposeWizardPanelComponent panel)
    {
        initComponents();
        this.panel = panel;
    }
    //=========================================================================
    @Override
    public String getName()
    {
        return "Aspose Components";
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jCheckBoxSelectAll = new javax.swing.JCheckBox();
        jCheckBoxAsposeCells = new javax.swing.JCheckBox();
        jCheckBoxAsposeWords = new javax.swing.JCheckBox();
        jCheckBoxAsposePdf = new javax.swing.JCheckBox();
        jCheckBoxAsposeSlides = new javax.swing.JCheckBox();
        jCheckBoxAsposeBarCode = new javax.swing.JCheckBox();
        jCheckBoxAsposeEmail = new javax.swing.JCheckBox();
        jCheckBoxAsposeOCR = new javax.swing.JCheckBox();
        jCheckBoxAsposeImaging = new javax.swing.JCheckBox();
        jCheckBoxAsposeTasks = new javax.swing.JCheckBox();
        jCheckBoxAsposeDiagram = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabelCommonUses = new javax.swing.JLabel();
        jLabelMessage = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/long_banner.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jLabel5.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jPanel6.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxSelectAll, org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jCheckBoxSelectAll.text")); // NOI18N
        jCheckBoxSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSelectAllActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposeCells, org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jCheckBoxAsposeCells.text")); // NOI18N
        jCheckBoxAsposeCells.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposeCellsActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposeWords, org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jCheckBoxAsposeWords.text")); // NOI18N
        jCheckBoxAsposeWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposeWordsActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposePdf, org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jCheckBoxAsposePdf.text")); // NOI18N
        jCheckBoxAsposePdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposePdfActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposeSlides, org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jCheckBoxAsposeSlides.text")); // NOI18N
        jCheckBoxAsposeSlides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposeSlidesActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposeBarCode, org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jCheckBoxAsposeBarCode.text")); // NOI18N
        jCheckBoxAsposeBarCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposeBarCodeActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposeEmail, org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jCheckBoxAsposeEmail.text")); // NOI18N
        jCheckBoxAsposeEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposeEmailActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposeOCR, org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jCheckBoxAsposeOCR.text")); // NOI18N
        jCheckBoxAsposeOCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposeOCRActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposeImaging, org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jCheckBoxAsposeImaging.text")); // NOI18N
        jCheckBoxAsposeImaging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposeImagingActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposeTasks, org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jCheckBoxAsposeTasks.text")); // NOI18N
        jCheckBoxAsposeTasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposeTasksActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposeDiagram, org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jCheckBoxAsposeDiagram.text")); // NOI18N
        jCheckBoxAsposeDiagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposeDiagramActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxSelectAll)
                    .addComponent(jCheckBoxAsposeCells)
                    .addComponent(jCheckBoxAsposeWords)
                    .addComponent(jCheckBoxAsposePdf)
                    .addComponent(jCheckBoxAsposeSlides)
                    .addComponent(jCheckBoxAsposeBarCode)
                    .addComponent(jCheckBoxAsposeEmail)
                    .addComponent(jCheckBoxAsposeOCR)
                    .addComponent(jCheckBoxAsposeImaging)
                    .addComponent(jCheckBoxAsposeTasks)
                    .addComponent(jCheckBoxAsposeDiagram))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxSelectAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxAsposeCells)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxAsposeWords)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxAsposePdf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxAsposeSlides)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxAsposeBarCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxAsposeEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxAsposeOCR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxAsposeImaging)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxAsposeTasks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxAsposeDiagram)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jPanel4.border.title"))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(333, 285));

        org.openide.awt.Mnemonics.setLocalizedText(jLabelCommonUses, org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jLabelCommonUses.text")); // NOI18N
        jLabelCommonUses.setToolTipText(org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jLabelCommonUses.toolTipText")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabelCommonUses, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabelCommonUses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.openide.awt.Mnemonics.setLocalizedText(jLabelMessage, org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jLabelMessage.text")); // NOI18N
        jLabelMessage.setToolTipText(org.openide.util.NbBundle.getMessage(AsposePanelVisualComponent.class, "AsposePanelVisualComponent.jLabelMessage.toolTipText")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxAsposeTasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposeTasksActionPerformed
        validateDialog();       // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposeTasksActionPerformed

    private void jCheckBoxAsposeImagingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposeImagingActionPerformed
        validateDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposeImagingActionPerformed

    private void jCheckBoxAsposeOCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposeOCRActionPerformed
        validateDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposeOCRActionPerformed

    private void jCheckBoxAsposeEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposeEmailActionPerformed
        validateDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposeEmailActionPerformed

    private void jCheckBoxAsposeBarCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposeBarCodeActionPerformed
        validateDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposeBarCodeActionPerformed

    private void jCheckBoxAsposeSlidesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposeSlidesActionPerformed
        validateDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposeSlidesActionPerformed

    private void jCheckBoxAsposePdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposePdfActionPerformed
        validateDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposePdfActionPerformed

    private void jCheckBoxAsposeWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposeWordsActionPerformed
        validateDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposeWordsActionPerformed

    private void jCheckBoxAsposeCellsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposeCellsActionPerformed
        validateDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposeCellsActionPerformed

    private void jCheckBoxSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSelectAllActionPerformed
        // TODO add your handling code here:
        setSelectionOfComponents(jCheckBoxSelectAll.isSelected());
        validateDialog();
    }//GEN-LAST:event_jCheckBoxSelectAllActionPerformed

    private void jCheckBoxAsposeDiagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposeDiagramActionPerformed
        validateDialog();       // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposeDiagramActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxAsposeBarCode;
    private javax.swing.JCheckBox jCheckBoxAsposeCells;
    private javax.swing.JCheckBox jCheckBoxAsposeDiagram;
    private javax.swing.JCheckBox jCheckBoxAsposeEmail;
    private javax.swing.JCheckBox jCheckBoxAsposeImaging;
    private javax.swing.JCheckBox jCheckBoxAsposeOCR;
    private javax.swing.JCheckBox jCheckBoxAsposePdf;
    private javax.swing.JCheckBox jCheckBoxAsposeSlides;
    private javax.swing.JCheckBox jCheckBoxAsposeTasks;
    private javax.swing.JCheckBox jCheckBoxAsposeWords;
    private javax.swing.JCheckBox jCheckBoxSelectAll;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCommonUses;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables

    @Override
    public void addNotify()
    {
        super.addNotify();
    }
    //=========================================================================
    boolean valid(WizardDescriptor wizardDescriptor)
    {
        AsposeConstants.println("Visual Panel Components valid  called..");
        if (isComponentSelected())
        {
            return true;
        }
        return false;
    }
    //=========================================================================
    void validate(WizardDescriptor d) throws WizardValidationException
    {
        // nothing to validate
    }
    //=========================================================================
    private boolean validateDialog()
    {
        panel.fireChangeEvent();
        if (!isComponentSelected())
        {
            diplayMessage(AsposeConstants.IS_COMPONENT_SELECTED, true);
            return false;
        }
        clearMessage();
        return true;

    }
    //=========================================================================
    private boolean isComponentSelected()
    {
        if (getjCheckBoxAsposeCells().isSelected())
        {
            return true;
        }
        if (getjCheckBoxAsposeWords().isSelected())
        {
            return true;
        }
        if (getjCheckBoxAsposePdf().isSelected())
        {
            return true;
        }
        if (getjCheckBoxAsposeSlides().isSelected())
        {
            return true;
        }
        if (getjCheckBoxAsposeBarCode().isSelected())
        {
            return true;
        }
        if (getjCheckBoxAsposeEmail().isSelected())
        {
            return true;
        }
        if (getjCheckBoxAsposeOCR().isSelected())
        {
            return true;
        }
        if (getjCheckBoxAsposeImaging().isSelected())
        {
            return true;
        }
        if (getjCheckBoxAsposeTasks().isSelected())
        {
            return true;
        }
        if (getjCheckBoxAsposeDiagram().isSelected())
        {
            return true;
        }

        return false;
    }
    //=========================================================================
    public void diplayMessage(String message, boolean error)
    {
        if (error)
        {
            jLabelMessage.setForeground(Color.RED);
            //jButtonFinish.setEnabled(false);
        }
        else
        {
            jLabelMessage.setForeground(Color.GREEN);
            //jButtonFinish.setEnabled(true);
        }
        jLabelMessage.setText(message);
        jLabelMessage.update(jLabelMessage.getGraphics());
    }
    //=========================================================================
    public void clearMessage()
    {
        jLabelMessage.setText("");
    }
    //=========================================================================
    private void setSelectionOfComponents(boolean value)
    {
        getjCheckBoxAsposeBarCode().setSelected(value);
        getjCheckBoxAsposeCells().setSelected(value);
        getjCheckBoxAsposeEmail().setSelected(value);
        getjCheckBoxAsposeImaging().setSelected(value);
        getjCheckBoxAsposeOCR().setSelected(value);
        getjCheckBoxAsposePdf().setSelected(value);
        getjCheckBoxAsposeSlides().setSelected(value);
        getjCheckBoxAsposeWords().setSelected(value);
        getjCheckBoxAsposeTasks().setSelected(value);
        getjCheckBoxAsposeDiagram().setSelected(value);
    }
    //=========================================================================
    void updateComponentsSelectionList()
    {
        if (getjCheckBoxAsposeCells().isSelected())
        {
            AsposeJavaComponent component = AsposeJavaComponents.list
                .get(AsposeConstants.ASPOSE_CELLS);
            component.set_selected(true);
        }

        if (getjCheckBoxAsposeWords().isSelected())
        {
            AsposeJavaComponent component = AsposeJavaComponents.list
                .get(AsposeConstants.ASPOSE_WORDS);
            component.set_selected(true);
        }
        if (getjCheckBoxAsposePdf().isSelected())
        {
            AsposeJavaComponent component = AsposeJavaComponents.list
                .get(AsposeConstants.ASPOSE_PDF);
            component.set_selected(true);

            AsposeJavaComponent component2 = AsposeJavaComponents.list
                .get(AsposeConstants.ASPOSE_PDF_KIT);
            component2.set_selected(true);

        }
        if (getjCheckBoxAsposeSlides().isSelected())
        {
            AsposeJavaComponent component = AsposeJavaComponents.list
                .get(AsposeConstants.ASPOSE_SLIDES);
            component.set_selected(true);
        }

        if (getjCheckBoxAsposeBarCode().isSelected())
        {
            AsposeJavaComponent component = AsposeJavaComponents.list
                .get(AsposeConstants.ASPOSE_BARCODE);
            component.set_selected(true);
        }

        if (getjCheckBoxAsposeEmail().isSelected())
        {
            AsposeJavaComponent component = AsposeJavaComponents.list
                .get(AsposeConstants.ASPOSE_EMAIL);
            component.set_selected(true);
        }
        if (getjCheckBoxAsposeOCR().isSelected())
        {
            AsposeJavaComponent component = AsposeJavaComponents.list
                .get(AsposeConstants.ASPOSE_OCR);
            component.set_selected(true);
        }
        if (getjCheckBoxAsposeImaging().isSelected())
        {
            AsposeJavaComponent component = AsposeJavaComponents.list
                .get(AsposeConstants.ASPOSE_IMAGING);
            component.set_selected(true);
        }
        if (getjCheckBoxAsposeTasks().isSelected())
        {
            AsposeJavaComponent component = AsposeJavaComponents.list
                .get(AsposeConstants.ASPOSE_TASKS);
            component.set_selected(true);
        }
        if (getjCheckBoxAsposeDiagram().isSelected())
        {
            AsposeJavaComponent component = AsposeJavaComponents.list
                .get(AsposeConstants.ASPOSE_DIAGRAM);
            component.set_selected(true);
        }

    }
    //=========================================================================
    /**
     * @return the jCheckBoxAsposeBarCode
     */
    public javax.swing.JCheckBox getjCheckBoxAsposeBarCode()
    {
        return jCheckBoxAsposeBarCode;
    }

    /**
     * @return the jCheckBoxAsposeCells
     */
    public javax.swing.JCheckBox getjCheckBoxAsposeCells()
    {
        return jCheckBoxAsposeCells;
    }

    /**
     * @return the jCheckBoxAsposeEmail
     */
    public javax.swing.JCheckBox getjCheckBoxAsposeEmail()
    {
        return jCheckBoxAsposeEmail;
    }

    /**
     * @return the jCheckBoxAsposeImaging
     */
    public javax.swing.JCheckBox getjCheckBoxAsposeImaging()
    {
        return jCheckBoxAsposeImaging;
    }

    /**
     * @return the jCheckBoxAsposeOCR
     */
    public javax.swing.JCheckBox getjCheckBoxAsposeOCR()
    {
        return jCheckBoxAsposeOCR;
    }

    /**
     * @return the jCheckBoxAsposePdf
     */
    public javax.swing.JCheckBox getjCheckBoxAsposePdf()
    {
        return jCheckBoxAsposePdf;
    }

    /**
     * @return the jCheckBoxAsposeSlides
     */
    public javax.swing.JCheckBox getjCheckBoxAsposeSlides()
    {
        return jCheckBoxAsposeSlides;
    }

    /**
     * @return the jCheckBoxAsposeWords
     */
    public javax.swing.JCheckBox getjCheckBoxAsposeWords()
    {
        return jCheckBoxAsposeWords;
    }
    /**
     * @return the jCheckBoxAsposeTasks
     */
    public javax.swing.JCheckBox getjCheckBoxAsposeTasks()
    {
        return jCheckBoxAsposeTasks;
    }
    /**
     * @return the jCheckBoxAsposeDiagram
     */
    public javax.swing.JCheckBox getjCheckBoxAsposeDiagram()
    {
        return jCheckBoxAsposeDiagram;
    }
}