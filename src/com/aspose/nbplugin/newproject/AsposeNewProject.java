/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.nbplugin.newproject;

import com.aspose.nbplugin.utils.AsposeComponentsManager;
import static com.aspose.nbplugin.utils.AsposeComponentsManager.extractFolder;
import static com.aspose.nbplugin.utils.AsposeComponentsManager.getLibaryDownloadPath;
import static com.aspose.nbplugin.utils.AsposeComponentsManager.removeExtention;
import com.aspose.nbplugin.utils.AsposeConstants;
import com.aspose.nbplugin.utils.AsposeJavaComponent;
import com.aspose.nbplugin.utils.AsposeJavaComponents;
import com.aspose.nbplugin.utils.GitHelper;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.Timer;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectManager;
import org.netbeans.api.project.ui.OpenProjects;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.Exceptions;

/**
 *
 * @author Administrator
 */
public class AsposeNewProject extends javax.swing.JDialog {

    List<String> list = new ArrayList<String>();
    Timer timer;
    //ppublic  javax.swing.JProgressBar progressBar = new progressBarPr;
    //private ActionListener timerListner;

    /**
     * Creates new form AsposeNewProject
     */
    public AsposeNewProject(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initComponentsUser();
        //setIconImage(new Image(getClass().getClassLoader().getResource("**images/aspose.png**")));
    }

    private void initComponentsUser() {
        //jLabelCommonUses.setText(AsposeConstants.ASPOSE_ALL_COMPONENTS_TEXT);
        jCheckBoxAsposeCells.setToolTipText(AsposeConstants.ASPOSE_CELLS_FEATURE_TEXT);
        jCheckBoxAsposeBarCode.setToolTipText(AsposeConstants.ASPOSE_BARCODE_FEATURE_TEXT);
        //jCheckBoxAsposeCells.setToolTipText(AsposeConstants.ASPOSE_CELLS_FEATURE_TEXT);
        jCheckBoxAsposeEmail.setToolTipText(AsposeConstants.ASPOSE_EMAIL_FEATURE_TEXT);
        jCheckBoxAsposeImaging.setToolTipText(AsposeConstants.ASPOSE_IMAGING_FEATURE_TEXT);
        
        // Commented as we currently not showing MetaFiles Component in Wizard Options
        //jCheckBoxAsposeMetafiles.setToolTipText(AsposeConstants.ASPOSE_METAFILES_FEATURE_TEXT);
        
        jCheckBoxAsposeOCR.setToolTipText(AsposeConstants.ASPOSE_OCR_FEATURE_TEXT);
        jCheckBoxAsposePdf.setToolTipText(AsposeConstants.ASPOSE_PDF_FEATURE_TEXT);
        jCheckBoxAsposeSlides.setToolTipText(AsposeConstants.ASPOSE_SLIDES_FEATURE_TEXT);
        jCheckBoxAsposeWords.setToolTipText(AsposeConstants.ASPOSE_WORDS_FEATURE_TEXT);

        jCheckBoxUseDefaultLocation.setSelected(true);
        jButtonBrowse.setEnabled(false);
        jTextFieldLocation.setEnabled(false);
        AsposeJavaComponents components = new AsposeJavaComponents();
        jTextFieldLocation.setText(AsposeComponentsManager.getAsposeHomePath() + "AsposeSamples");
        //;
        // getOpenedProjects();
        validateDialog();
    }

    private boolean isComponentSelected() {
        if (jCheckBoxAsposeCells.isSelected()) {
            return true;
        }
        if (jCheckBoxAsposeWords.isSelected()) {
            return true;
        }
        if (jCheckBoxAsposePdf.isSelected()) {
            return true;
        }
        if (jCheckBoxAsposeSlides.isSelected()) {
            return true;
        }
        if (jCheckBoxAsposeBarCode.isSelected()) {
            return true;
        }
        
        // Commented as we currently not showing MetaFiles Component in Wizard Options
        /*
        if (jCheckBoxAsposeMetafiles.isSelected()) {
            return true;
        }
        */
        
        if (jCheckBoxAsposeEmail.isSelected()) {
            return true;
        }
        if (jCheckBoxAsposeOCR.isSelected()) {
            return true;
        }
        if (jCheckBoxAsposeImaging.isSelected()) {
            return true;
        }

        return false;
    }

    private boolean isProjectNameValid() {
        if (jTextFieldProjectName.getText().length() == 0) {
            return false;
        }
        return true;
    }

    private boolean validateDialog() {
        if (!isComponentSelected()) {
            diplayMessage(AsposeConstants.IS_COMPONENT_SELECTED, true);
            return false;
        }
        if (!isProjectNameValid()) {
            diplayMessage("Project name required", true);
            return false;
        }

        clearMessage();
        return true;
    }

    public void clearMessage() {
        jLabelMessage.setText("");
        jButtonFinish.setEnabled(true);
    }

    public void diplayMessage(String message, boolean error) {
        if (error) {
            jLabelMessage.setForeground(Color.RED);
            jButtonFinish.setEnabled(false);
        } else {
            jLabelMessage.setForeground(Color.GREEN);
            jButtonFinish.setEnabled(true);
        }
        jLabelMessage.setText(message);
        jLabelMessage.update(jLabelMessage.getGraphics());
    }

    /**
     *
     * @param title
     * @param message
     * @param style
     * @return
     */
    public int showMessage(String title, String message, int buttons, int icon) {
        //JOptionPane.YES_NO_OPTION,JOptionPane.ERROR
        int result = JOptionPane.showConfirmDialog(this, message, title, buttons, icon);
        return result;
        //MessageBox msgBox = new MessageBox(getShell(),style/*SWT.ICON_WARNING | SWT.YES | SWT.NO | SWT.CANCEL*/);
        //msgBox.setMessage(message);
        //msgBox.setText(title);
        //return msgBox.open();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonFinish = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        progressBarPr = new javax.swing.JProgressBar();
        jLabelMessage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldProjectName = new javax.swing.JTextField();
        jCheckBoxUseDefaultLocation = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldLocation = new javax.swing.JTextField();
        jButtonBrowse = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jCheckBoxSelectAll = new javax.swing.JCheckBox();
        jCheckBoxAsposeCells = new javax.swing.JCheckBox();
        jCheckBoxAsposeWords = new javax.swing.JCheckBox();
        jCheckBoxAsposePdf = new javax.swing.JCheckBox();
        jCheckBoxAsposeSlides = new javax.swing.JCheckBox();
        jCheckBoxAsposeBarCode = new javax.swing.JCheckBox();
        jCheckBoxAsposeEmail = new javax.swing.JCheckBox();
        jCheckBoxAsposeOCR = new javax.swing.JCheckBox();
        jCheckBoxAsposeImaging = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabelCommonUses = new javax.swing.JLabel();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jLabel1.text")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(null);
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/long_banner.PNG"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jLabel2.text")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jLabel3.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        org.openide.awt.Mnemonics.setLocalizedText(jButtonFinish, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jButtonFinish.text")); // NOI18N
        jButtonFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinishActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jButtonCancel, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jButtonCancel.text")); // NOI18N
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jButtonFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFinish, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        org.openide.awt.Mnemonics.setLocalizedText(jLabelMessage, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jLabelMessage.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jLabel4.text")); // NOI18N

        jTextFieldProjectName.setText(org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jTextFieldProjectName.text")); // NOI18N
        jTextFieldProjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProjectNameActionPerformed(evt);
            }
        });
        jTextFieldProjectName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldProjectNameKeyReleased(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxUseDefaultLocation, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jCheckBoxUseDefaultLocation.text")); // NOI18N
        jCheckBoxUseDefaultLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUseDefaultLocationActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jLabel5.text")); // NOI18N

        jTextFieldLocation.setText(org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jTextFieldLocation.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jButtonBrowse, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jButtonBrowse.text")); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jPanel3.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxSelectAll, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jCheckBoxSelectAll.text")); // NOI18N
        jCheckBoxSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSelectAllActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposeCells, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jCheckBoxAsposeCells.text")); // NOI18N
        jCheckBoxAsposeCells.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposeCellsActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposeWords, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jCheckBoxAsposeWords.text")); // NOI18N
        jCheckBoxAsposeWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposeWordsActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposePdf, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jCheckBoxAsposePdf.text")); // NOI18N
        jCheckBoxAsposePdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposePdfActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposeSlides, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jCheckBoxAsposeSlides.text")); // NOI18N
        jCheckBoxAsposeSlides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposeSlidesActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposeBarCode, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jCheckBoxAsposeBarCode.text")); // NOI18N
        jCheckBoxAsposeBarCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposeBarCodeActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposeEmail, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jCheckBoxAsposeEmail.text")); // NOI18N
        jCheckBoxAsposeEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposeEmailActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposeOCR, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jCheckBoxAsposeOCR.text")); // NOI18N
        jCheckBoxAsposeOCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposeOCRActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxAsposeImaging, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jCheckBoxAsposeImaging.text")); // NOI18N
        jCheckBoxAsposeImaging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAsposeImagingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxSelectAll)
                    .addComponent(jCheckBoxAsposeCells)
                    .addComponent(jCheckBoxAsposeWords)
                    .addComponent(jCheckBoxAsposePdf)
                    .addComponent(jCheckBoxAsposeSlides)
                    .addComponent(jCheckBoxAsposeBarCode)
                    .addComponent(jCheckBoxAsposeEmail)
                    .addComponent(jCheckBoxAsposeOCR)
                    .addComponent(jCheckBoxAsposeImaging))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
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
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jPanel4.border.title"))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(333, 285));

        org.openide.awt.Mnemonics.setLocalizedText(jLabelCommonUses, org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jLabelCommonUses.text")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabelCommonUses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabelCommonUses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(progressBarPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBoxUseDefaultLocation)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBrowse))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxUseDefaultLocation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBrowse))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(progressBarPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMessage))
                .addGap(5, 5, 5))
        );

        jLabelMessage.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(AsposeNewProject.class, "AsposeNewProject.jLabelMessage.AccessibleContext.accessibleName")); // NOI18N

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        //System.exit(0);
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jCheckBoxUseDefaultLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUseDefaultLocationActionPerformed
        // TODO add your handling code here:
        if (jCheckBoxUseDefaultLocation.isSelected()) {
            jButtonBrowse.setEnabled(false);
            jTextFieldLocation.setEnabled(false);
        } else {
            jButtonBrowse.setEnabled(true);
            jTextFieldLocation.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBoxUseDefaultLocationActionPerformed

    private void jCheckBoxSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSelectAllActionPerformed
        // TODO add your handling code here:
        setSelectionOfComponents(jCheckBoxSelectAll.isSelected());
        validateDialog();
    }//GEN-LAST:event_jCheckBoxSelectAllActionPerformed

    private void jCheckBoxAsposeCellsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposeCellsActionPerformed
        validateDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposeCellsActionPerformed

    private void jCheckBoxAsposeWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposeWordsActionPerformed
        validateDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposeWordsActionPerformed

    private void jCheckBoxAsposePdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposePdfActionPerformed
        validateDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposePdfActionPerformed

    private void jCheckBoxAsposeSlidesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposeSlidesActionPerformed
        validateDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposeSlidesActionPerformed

    private void jCheckBoxAsposeBarCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposeBarCodeActionPerformed
        validateDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposeBarCodeActionPerformed

    private void jCheckBoxAsposeEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposeEmailActionPerformed
        validateDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposeEmailActionPerformed

    private void jCheckBoxAsposeOCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposeOCRActionPerformed
        validateDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposeOCRActionPerformed

    private void jCheckBoxAsposeImagingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAsposeImagingActionPerformed
        validateDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAsposeImagingActionPerformed

    private void jTextFieldProjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProjectNameActionPerformed
        validateDialog();        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProjectNameActionPerformed

    private void jTextFieldProjectNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProjectNameKeyReleased
        validateDialog();  // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProjectNameKeyReleased

    private void jButtonFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinishActionPerformed

        SwingWorker sw = new SwingWorker<String, Void>() {
            @Override
            protected String doInBackground() {
                try {
                    performFinish();
                } catch (Exception ex) {
                    
                }
                return null;
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        sw.execute();
    }//GEN-LAST:event_jButtonFinishActionPerformed

    private void performFinish() {
//Logging.log.setLevel(Level.ALL);
//Logging.log.severe("Error....");
        updateComponentsSelectionList();
        //validateDialog(); 
        if (downloadComponents() == false) {
            clearMessage();
            return;
        }
        //timer.stop();
        try {
            //downloadComponents();
            createProject();
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        dispose();
    }

    private void extractTemplate(String projectPath, String projectName) throws IOException {
        URL url = getClass().getResource("/resources/AsposeComponents.zip");
        //String fileName = fileurl.getFile();
        //URL url = getClassLoader().getResource("com/test/io/test.txt");
        //String fileName ="d:\\abc\\prj";
        GitHelper.checkAndCreateFolder(projectPath);
        FileOutputStream output = new FileOutputStream(projectPath + File.separator + "AsposeComponents.zip");
        InputStream input = url.openStream();
        byte[] buffer = new byte[4096];
        int bytesRead = input.read(buffer);
        while (bytesRead != -1) {
            output.write(buffer, 0, bytesRead);
            bytesRead = input.read(buffer);
        }
        output.flush();
        output.close();
        input.close();

        AsposeComponentsManager.extractFolder(projectPath + File.separator + "AsposeComponents.zip", projectPath + File.separator + projectName);
        File fl = new File(projectPath + File.separator + "AsposeComponents.zip");
        fl.delete();

        //(projectPath + File.separator + "AsposeComponents.zip");
    }

    public static void replace(String oldstring, String newstring, String filePath)
            throws IOException {

        File in = new File(filePath);
        File out = new File(filePath + "bk");
        BufferedReader reader = new BufferedReader(new FileReader(in));
        PrintWriter writer = new PrintWriter(new FileWriter(out));
        String line = null;
        while ((line = reader.readLine()) != null) {
            writer.println(line.replaceAll(oldstring, newstring));
        }

        // I'm aware of the potential for resource leaks here. Proper resource
        // handling has been omitted in the interest of brevity
        reader.close();
        writer.close();
        in.delete();
        out.renameTo(new File(filePath));
    }

    private void setProjectName(String projectPath) throws FileNotFoundException {
        String myfile = projectPath + File.separator + "nbproject"+ File.separator +"project.xml";
        try {
            replace("AsposeComponents", jTextFieldProjectName.getText(), myfile);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    private void copyLibraryFiles(String projectPath) {

        for (AsposeJavaComponent component : AsposeJavaComponents.list.values()) {

            if (component.is_selected()) {
                try {
                    AsposeComponentsManager.copyDirectory(AsposeComponentsManager.getLibaryDownloadPath() + component.get_name().toLowerCase(), projectPath + File.separator + "lib" + File.separator + component.get_name());
                } catch (IOException ex) {
                    //Exceptions.printStackTrace(ex);
                    //Logging.log.severe(ex.getMessage());
                }
            }
        }
    }

    private void SearchJarFiles(File aFile) {
        //spc_count++;
        //String spcs = "";
        //for (int i = 0; i < spc_count; i++)
        //spcs += " ";
        //List <String> list = new ArrayList<String>();
        if (aFile.isFile()) {

            if (aFile.getName().toLowerCase().endsWith(".jar")) {
                /*LibraryCollection libCol = new LibraryCollection();
                 libCol.setLibraryPath(aFile.getAbsolutePath());
                 libCol.setLibraryName(aFile.getName());*/
                list.add(aFile.getAbsolutePath());
            }
            //System.out.println(spcs + "[FILE] " + aFile.getName());
        } else if (aFile.isDirectory()) {
            //System.out.println(spcs + "[DIR] " + aFile.getName());
            File[] listOfFiles = aFile.listFiles();
            if (listOfFiles != null) {
                for (int i = 0; i < listOfFiles.length; i++) {
                    SearchJarFiles(listOfFiles[i]);
                }
            } else {
                //System.out.println(spcs + " [ACCESS DENIED]");
            }
        }

        //return list;
        //spc_count--;
    }

    public void addLibraryFileToProject(String filePath)
            throws IOException {

        File in = new File(filePath);
        File out = new File(filePath + "bk");
        BufferedReader reader = new BufferedReader(new FileReader(in));
        PrintWriter writer = new PrintWriter(new FileWriter(out));
        String line = null;
        while ((line = reader.readLine()) != null) {
            writer.println(line);
            if (line.toString().equals("excludes=")) {
                //String projectPath
                list.clear();
                SearchJarFiles(new File(jTextFieldLocation.getText() + File.separator + jTextFieldProjectName.getText() + File.separator + "lib"));
                //int x = list.size();
                Iterator<String> iterator = list.iterator();
                while (iterator.hasNext()) {

                    String libraryPath = iterator.next();
                    String libraryName = (new File(libraryPath)).getName();
                    libraryPath = libraryPath.replace("\\", "\\\\");
                    //String projectRoot = GetProjectRootPath();
                    //File fl = new File(projectRoot);

                    //libraryPath = libraryPath.replace(fl.getAbsolutePath(), "src");
                    //libraryName = libraryName;
                    String libEntry = "file.reference." + libraryName + "=" + libraryPath;
                    writer.println(libEntry);
                }
            }

            if (line.toString().equals("javac.classpath=\\")) {
                Iterator<String> iterator = list.iterator();
                int size = list.size();
                int cur = 1;
                while (iterator.hasNext()) {
                    String libraryPath = iterator.next();
                    String libraryName = (new File(libraryPath)).getName();
                    //libraryName = libraryName;
                    String libEntry = "";
                    if (cur != size) {
                        libEntry = "    ${file.reference." + libraryName + "}:\\";
                    } else {
                        libEntry = "    ${file.reference." + libraryName + "}";
                    }
                    writer.println(libEntry);
                    cur++;
                }
            }
            //writer.println(line.replaceAll(oldstring, newstring));
        }

        // I'm aware of the potential for resource leaks here. Proper resource
        // handling has been omitted in the interest of brevity
        reader.close();
        writer.close();
        in.delete();
        out.renameTo(new File(filePath));
    }

    private String GetProjectRootPath() {
        return jTextFieldProjectName.getText() + File.separator + jTextFieldLocation.getText();
    }

    private boolean createProject() throws IOException {
        //import javax.tools.FileObject;
        String projectPath = jTextFieldLocation.getText();
        String projectName = jTextFieldProjectName.getText();

        extractTemplate(projectPath, projectName);
        setProjectName(projectPath + File.separator + projectName);
        copyLibraryFiles(projectPath + File.separator + projectName);
        addLibraryFileToProject(projectPath + File.separator + projectName + File.separator + "nbproject"+File.separator+"project.properties");
        // File egdir = FileUtil.normalizeFile("C:\\Users\\Administrator\\Documents\\TemplatePrj\\AsposeComponents");
        File egdir = new File(projectPath + File.separator + projectName);
        FileObject obj = FileUtil.toFileObject(egdir);

        boolean aa = ProjectManager.getDefault().isProject(obj);

        Project project = ProjectManager.getDefault().findProject(obj);

        Project[] projects = new Project[1];
        projects[0] = project;
        OpenProjects.getDefault().open(projects, false);
        return true;
    }

    private boolean downloadComponents() {

        diplayMessage("Please wait, Preparing to download selected components", true);
        //jLabelMessage.update(jLabelMessage.getGraphics());
        AsposeComponentsManager comManager = new AsposeComponentsManager(
                this);
        if (!comManager.downloadComponents()) {
            return false;
        }

        return true;
    }

    void updateComponentsSelectionList() {
        if (jCheckBoxAsposeCells.isSelected()) {
            AsposeJavaComponent component = AsposeJavaComponents.list
                    .get(AsposeConstants.ASPOSE_CELLS);
            component.set_selected(true);
        }

        if (jCheckBoxAsposeWords.isSelected()) {
            AsposeJavaComponent component = AsposeJavaComponents.list
                    .get(AsposeConstants.ASPOSE_WORDS);
            component.set_selected(true);
        }
        if (jCheckBoxAsposePdf.isSelected()) {
            AsposeJavaComponent component = AsposeJavaComponents.list
                    .get(AsposeConstants.ASPOSE_PDF);
            component.set_selected(true);

            AsposeJavaComponent component2 = AsposeJavaComponents.list
                    .get(AsposeConstants.ASPOSE_PDF_KIT);
            component2.set_selected(true);

        }
        if (jCheckBoxAsposeSlides.isSelected()) {
            AsposeJavaComponent component = AsposeJavaComponents.list
                    .get(AsposeConstants.ASPOSE_SLIDES);
            component.set_selected(true);
        }

        if (jCheckBoxAsposeBarCode.isSelected()) {
            AsposeJavaComponent component = AsposeJavaComponents.list
                    .get(AsposeConstants.ASPOSE_BARCODE);
            component.set_selected(true);
        }
        
        // Commented as we currently not showing MetaFiles Component in Wizard Options
        /*
        if (jCheckBoxAsposeMetafiles.isSelected()) {
            AsposeJavaComponent component = AsposeJavaComponents.list
                    .get(AsposeConstants.ASPOSE_METAFILES);
            component.set_selected(true);
        }
        */
        
        if (jCheckBoxAsposeEmail.isSelected()) {
            AsposeJavaComponent component = AsposeJavaComponents.list
                    .get(AsposeConstants.ASPOSE_EMAIL);
            component.set_selected(true);
        }
        if (jCheckBoxAsposeOCR.isSelected()) {
            AsposeJavaComponent component = AsposeJavaComponents.list
                    .get(AsposeConstants.ASPOSE_OCR);
            component.set_selected(true);
        }
        if (jCheckBoxAsposeImaging.isSelected()) {
            AsposeJavaComponent component = AsposeJavaComponents.list
                    .get(AsposeConstants.ASPOSE_IMAGING);
            component.set_selected(true);
        }


    }

    /**
     *
     * @param value
     */
    private void setSelectionOfComponents(boolean value) {
        jCheckBoxAsposeBarCode.setSelected(value);
        jCheckBoxAsposeCells.setSelected(value);
        jCheckBoxAsposeEmail.setSelected(value);
        jCheckBoxAsposeImaging.setSelected(value);
        
        // Commented as we currently not showing MetaFiles Component in Wizard Options
        //jCheckBoxAsposeMetafiles.setSelected(value);
        
        jCheckBoxAsposeOCR.setSelected(value);
        jCheckBoxAsposePdf.setSelected(value);
        jCheckBoxAsposeSlides.setSelected(value);
        jCheckBoxAsposeWords.setSelected(value);

    }

    public void PBsetVisible(boolean value) {
        progressBarPr.setVisible(value);
    }

    public void PBsetMinimum(int value) {
        progressBarPr.setMinimum(value);
    }

    public void PBsetMaximum(int value) {
        progressBarPr.setMaximum(value);
    }

    public void PBsetSelection(int value) {
        progressBarPr.setValue(value);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AsposeNewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsposeNewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsposeNewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsposeNewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AsposeNewProject dialog = new AsposeNewProject(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBrowse;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonFinish;
    private javax.swing.JCheckBox jCheckBoxAsposeBarCode;
    private javax.swing.JCheckBox jCheckBoxAsposeCells;
    private javax.swing.JCheckBox jCheckBoxAsposeEmail;
    private javax.swing.JCheckBox jCheckBoxAsposeImaging;
    private javax.swing.JCheckBox jCheckBoxAsposeOCR;
    private javax.swing.JCheckBox jCheckBoxAsposePdf;
    private javax.swing.JCheckBox jCheckBoxAsposeSlides;
    private javax.swing.JCheckBox jCheckBoxAsposeWords;
    private javax.swing.JCheckBox jCheckBoxSelectAll;
    private javax.swing.JCheckBox jCheckBoxUseDefaultLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCommonUses;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextFieldLocation;
    private javax.swing.JTextField jTextFieldProjectName;
    private javax.swing.JProgressBar progressBarPr;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @param urlStr
     * @param outputFile
     * @return
     */
    public boolean downloadFileFromInternet(String urlStr, String outputFile, String name) {
        InputStream input;
        int bufferSize = 4096;
        String localPath = getLibaryDownloadPath();
        try {
            diplayMessage("Please wait, downloading " + name, true);
            //jLabelMessage.setText("Please wait, downloading " + name);
            //jLabelMessage.update(jLabelMessage.getGraphics());
            //_pageOne.
            //_pageOne.
            URL url = new URL(urlStr);
            input = url.openStream();
            byte[] buffer = new byte[bufferSize];
            File f = new File(localPath + outputFile);
            OutputStream output = new FileOutputStream(f);
            int bytes = 0;
            long totalLength = AsposeComponentsManager.getFileDownloadLength(urlStr);
            long pages = totalLength / bufferSize;
            PBsetVisible(true);
            PBsetMaximum((int) pages);
            PBsetMinimum(0);
            PBsetSelection(0);

            int currentPage = 0;
            try {
                int bytesRead;
                while ((bytesRead = input.read(buffer, 0, buffer.length)) >= 0) {
                    output.write(buffer, 0, bytesRead);
                    bytes = bytes + buffer.length;
                    //wait();
                    PBsetSelection(currentPage);
                    //_pageOne.progressBar.redraw();
                    currentPage = currentPage + 1;
                }

                output.flush();
                output.close();
                PBsetSelection(currentPage);
                extractFolder(localPath + outputFile, localPath + removeExtention(outputFile));

                PBsetSelection(0);
                PBsetVisible(false);

                clearMessage();
            } finally {
            }
        } catch (Exception ex) {
            PBsetSelection(0);
            PBsetVisible(false);
            clearMessage();
            return false;
        }
        return true;
    }
}
