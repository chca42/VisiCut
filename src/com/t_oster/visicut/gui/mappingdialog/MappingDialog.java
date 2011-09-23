/**
 * This file is part of VisiCut.
 * 
 *     VisiCut is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * 
 *    VisiCut is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 * 
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with VisiCut.  If not, see <http://www.gnu.org/licenses/>.
 **/

/*
 * MappingDialog.java
 *
 * Created on 24.08.2011, 11:44:29
 */
package com.t_oster.visicut.gui.mappingdialog;

import com.t_oster.liblasercut.platform.Util;
import com.t_oster.visicut.model.LaserProfile;
import com.t_oster.visicut.model.mapping.Mapping;
import com.t_oster.visicut.model.MaterialProfile;
import com.t_oster.visicut.model.VectorProfile;
import com.t_oster.visicut.model.graphicelements.GraphicSet;
import com.t_oster.visicut.model.mapping.FilterSet;
import com.t_oster.visicut.model.mapping.MappingSet;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * @author thommy
 */
public class MappingDialog extends javax.swing.JDialog
{

  public MappingDialog()
  {
    this(null, true);
  }
  private MappingListModel mappingListModel;

  /** Creates new form MappingDialog */
  public MappingDialog(java.awt.Frame parent, boolean modal)
  {
    super(parent, modal);
    initComponents();
    mappingListModel = (MappingListModel) this.mappingTable1.getModel();
    //To Capture changes to the "use outline" column
    mappingListModel.addTableModelListener(new TableModelListener()
    {

      public void tableChanged(TableModelEvent tme)
      {
        if (MappingDialog.this.getSelectedMapping() != null)
        {
          MappingDialog.this.setSelectedMapping(MappingDialog.this.getSelectedMapping());
        }
      }
    });
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        cuttingProfilesPanel1 = new com.t_oster.visicut.gui.mappingdialog.LaserProfilesPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mappingJTree = new com.t_oster.visicut.gui.mappingdialog.MappingJTree();
        jPanel1 = new javax.swing.JPanel();
        matchingPartsPanel1 = new com.t_oster.visicut.gui.mappingdialog.MatchingPartsPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        mappingTable1 = new com.t_oster.visicut.gui.mappingdialog.MappingTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        nameTF = new javax.swing.JTextField();
        nameLB = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        selectThumbnailButton1 = new com.t_oster.visicut.gui.beans.SelectThumbnailButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Form"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        cuttingProfilesPanel1.setName("cuttingProfilesPanel1"); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${material}"), cuttingProfilesPanel1, org.jdesktop.beansbinding.BeanProperty.create("material"), "MaterialToProfilesPanel");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${selectedLProfile}"), cuttingProfilesPanel1, org.jdesktop.beansbinding.BeanProperty.create("selectedLaserProfile"), "LaserProfileFormPanel");
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout cuttingProfilesPanel1Layout = new javax.swing.GroupLayout(cuttingProfilesPanel1);
        cuttingProfilesPanel1.setLayout(cuttingProfilesPanel1Layout);
        cuttingProfilesPanel1Layout.setHorizontalGroup(
            cuttingProfilesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        cuttingProfilesPanel1Layout.setVerticalGroup(
            cuttingProfilesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(cuttingProfilesPanel1);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.t_oster.visicut.gui.VisicutApp.class).getContext().getResourceMap(MappingDialog.class);
        okButton.setText(resourceMap.getString("okButton.text")); // NOI18N
        okButton.setName("okButton"); // NOI18N
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText(resourceMap.getString("cancelButton.text")); // NOI18N
        cancelButton.setName("cancelButton"); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        mappingJTree.setName("mappingJTree"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, this, org.jdesktop.beansbinding.ELProperty.create("${graphicElements}"), mappingJTree, org.jdesktop.beansbinding.BeanProperty.create("graphicObjects"), "GraphicObjectsFormToTree");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, this, org.jdesktop.beansbinding.ELProperty.create("${currentMappings}"), mappingJTree, org.jdesktop.beansbinding.BeanProperty.create("mappings"), "MappingsFromForm");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${selectedFilters}"), mappingJTree, org.jdesktop.beansbinding.BeanProperty.create("selectedFilterSet"), "FilterSetFormTree");
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(mappingJTree);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setName("jPanel1"); // NOI18N

        matchingPartsPanel1.setBorder(null);
        matchingPartsPanel1.setName("matchingPartsPanel1"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, this, org.jdesktop.beansbinding.ELProperty.create("${graphicElements}"), matchingPartsPanel1, org.jdesktop.beansbinding.BeanProperty.create("graphicElements"), "GraphicElementsFromForm");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, this, org.jdesktop.beansbinding.ELProperty.create("${currentMappings}"), matchingPartsPanel1, org.jdesktop.beansbinding.BeanProperty.create("mappings"), "MappingsFromFormToPanel");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, this, org.jdesktop.beansbinding.ELProperty.create("${material}"), matchingPartsPanel1, org.jdesktop.beansbinding.BeanProperty.create("material"), "MaterialToPanel");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, this, org.jdesktop.beansbinding.ELProperty.create("${selectedFilters}"), matchingPartsPanel1, org.jdesktop.beansbinding.BeanProperty.create("selectedFilterSet"), "FilterSetFormPanel");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, this, org.jdesktop.beansbinding.ELProperty.create("${selectedMapping}"), matchingPartsPanel1, org.jdesktop.beansbinding.BeanProperty.create("selectedMapping"), "MappingFormPanel");
        bindingGroup.addBinding(binding);

        matchingPartsPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                matchingPartsPanel1PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout matchingPartsPanel1Layout = new javax.swing.GroupLayout(matchingPartsPanel1);
        matchingPartsPanel1.setLayout(matchingPartsPanel1Layout);
        matchingPartsPanel1Layout.setHorizontalGroup(
            matchingPartsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );
        matchingPartsPanel1Layout.setVerticalGroup(
            matchingPartsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(matchingPartsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(matchingPartsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jCheckBox1.setText(resourceMap.getString("jCheckBox1.text")); // NOI18N
        jCheckBox1.setName("jCheckBox1"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, matchingPartsPanel1, org.jdesktop.beansbinding.ELProperty.create("${previewMode}"), jCheckBox1, org.jdesktop.beansbinding.BeanProperty.create("selected"), "prevmode");
        bindingGroup.addBinding(binding);

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        mappingTable1.setName("mappingTable1"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${material}"), mappingTable1, org.jdesktop.beansbinding.BeanProperty.create("material"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, this, org.jdesktop.beansbinding.ELProperty.create("${selectedFilters}"), mappingTable1, org.jdesktop.beansbinding.BeanProperty.create("selectedFilterSet"), "selectedFilterSet");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${selectedMapping}"), mappingTable1, org.jdesktop.beansbinding.BeanProperty.create("selectedMapping"), "sfsdf");
        bindingGroup.addBinding(binding);

        jScrollPane3.setViewportView(mappingTable1);

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        progressBar.setName("progressBar"); // NOI18N

        nameTF.setName("nameTF"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentMappings.name}"), nameTF, org.jdesktop.beansbinding.BeanProperty.create("text"), "name");
        bindingGroup.addBinding(binding);

        nameLB.setText(resourceMap.getString("nameLB.text")); // NOI18N
        nameLB.setName("nameLB"); // NOI18N

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jTextField1.setName("jTextField1"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentMappings.description}"), jTextField1, org.jdesktop.beansbinding.BeanProperty.create("text_ON_ACTION_OR_FOCUS_LOST"), "desc");
        bindingGroup.addBinding(binding);

        selectThumbnailButton1.setName("selectThumbnailButton1"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${currentMappings.thumbnailPath}"), selectThumbnailButton1, org.jdesktop.beansbinding.BeanProperty.create("thumbnailPath"), "thubmpath");
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1206, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectThumbnailButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jCheckBox1))
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLB)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectThumbnailButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
  protected LaserProfile selectedLaserProfile = null;
  public static final String PROP_SELECTEDLASERPROFILE = "selectedLaserProfile";
  public static final String PROP_MATERIAL = "material";
  protected MaterialProfile material = null;
  protected MappingSet mappings = null;
  public static final String PROP_MAPPINGS = "mappings";
  protected FilterSet selectedFilterSet = null;
  public static final String PROP_SELECTEDFILTERSET = "selectedFilterSet";
  protected MappingSet currentMappings = new MappingSet();
  public static final String PROP_CURRENTMAPPINGS = "currentMappings";
  protected Mapping selectedMapping = null;
  public static final String PROP_SELECTEDMAPPING = "selectedMapping";
  protected boolean showName = true;
  public static final String PROP_SHOWNAME = "showName";

  /**
   * Get the value of showName
   *
   * @return the value of showName
   */
  public boolean isShowName()
  {
    return showName;
  }

  /**
   * Set the value of showName
   *
   * @param showName new value of showName
   */
  public void setShowName(boolean showName)
  {
    boolean oldShowName = this.showName;
    this.showName = showName;
    firePropertyChange(PROP_SHOWNAME, oldShowName, showName);
    nameTF.setVisible(showName);
    nameLB.setVisible(showName);
  }

  /**
   * Get the value of selectedMapping
   *
   * @return the value of selectedMapping
   */
  public Mapping getSelectedMapping()
  {
    return selectedMapping;
  }

  /**
   * Set the value of selectedMapping
   *
   * @param selectedMapping new value of selectedMapping
   */
  public void setSelectedMapping(Mapping selectedMapping)
  {
    Mapping oldSelectedMapping = this.selectedMapping;
    this.selectedMapping = selectedMapping;
    firePropertyChange(PROP_SELECTEDMAPPING, oldSelectedMapping, selectedMapping);
    if (selectedMapping != null)
    {
      this.setSelectedFilters(null);
      if (selectedMapping.getProfileName() != null)
      {
        if (this.material != null && this.material.getLaserProfile(selectedMapping.getProfileName()) != null)
        {
          this.setSelectedLProfile(this.material.getLaserProfile(selectedMapping.getProfileName()));
        }
      }
    }
  }
  protected FilterSet selectedFilters = null;
  public static final String PROP_SELECTEDFILTERS = "selectedFilters";

  /**
   * Get the value of selectedFilters
   *
   * @return the value of selectedFilters
   */
  public FilterSet getSelectedFilters()
  {
    return selectedFilters;
  }

  /**
   * Set the value of selectedFilters
   *
   * @param selectedFilters new value of selectedFilters
   */
  public void setSelectedFilters(FilterSet selectedFilters)
  {
    FilterSet oldSelectedFilters = this.selectedFilters;
    this.selectedFilters = selectedFilters;
    firePropertyChange(PROP_SELECTEDFILTERS, oldSelectedFilters, selectedFilters);
    if (selectedFilters != null)
    {
      this.setSelectedLProfile(null);
      this.setSelectedMapping(null);
    }
  }
  protected LaserProfile selectedLProfile = null;
  public static final String PROP_SELECTEDLPROFILE = "selectedLProfile";

  /**
   * Get the value of selectedLProfile
   *
   * @return the value of selectedLProfile
   */
  public LaserProfile getSelectedLProfile()
  {
    return selectedLProfile;
  }

  /**
   * Set the value of selectedLProfile
   *
   * @param selectedLProfile new value of selectedLProfile
   */
  public void setSelectedLProfile(LaserProfile selectedLProfile)
  {
    LaserProfile oldSelectedLProfile = this.selectedLProfile;
    this.selectedLProfile = selectedLProfile;
    firePropertyChange(PROP_SELECTEDLPROFILE, oldSelectedLProfile, selectedLProfile);
    if (Util.differ(oldSelectedLProfile, selectedLProfile))
    {
      if (selectedLProfile != null)
      {
        if (this.getSelectedMapping() != null)
        {//Mapping selected, so we change Profile
          this.getSelectedMapping().setProfileName(selectedLProfile.getName());
          if (!(selectedLProfile instanceof VectorProfile))
          {
            this.getSelectedMapping().getFilterSet().setUseOuterShape(false);
          }
          int idx = this.currentMappings.indexOf(this.getSelectedMapping());
          this.mappingListModel.fireTableRowsUpdated(idx, idx);
          this.matchingPartsPanel1.setSelectedMapping(this.getSelectedMapping());
        }
        else
        {
          if (this.getSelectedFilters() != null)
          {//A FilterSet is selected, so we create a new Mapping
            Mapping m = new Mapping();
            m.setFilterSet(this.getSelectedFilters());
            m.setProfileName(selectedLProfile.getName());
            this.currentMappings.add(m);
            this.mappingListModel.fireTableRowsInserted(this.currentMappings.size() - 1, this.currentMappings.size() - 1);
            this.setSelectedMapping(m);
          }
        }
      }
    }
    this.mappingJTree.repaint();
  }

  /**
   * Get the value of currentMappings
   *
   * @return the value of currentMappings
   */
  public MappingSet getCurrentMappings()
  {
    return currentMappings;
  }

  /**
   * Set the value of currentMappings
   *
   * @param currentMappings new value of currentMappings
   */
  public void setCurrentMappings(MappingSet currentMappings)
  {
    MappingSet oldCurrentMappings = this.currentMappings;
    this.currentMappings = currentMappings;
    firePropertyChange(PROP_CURRENTMAPPINGS, oldCurrentMappings, currentMappings);
    this.mappingTable1.setMappings(currentMappings);
  }

  /**
   * Get the value of mappings
   *
   * @return the value of mappings
   */
  public MappingSet getMappings()
  {
    return mappings;
  }

  /**
   * Set the value of mappings
   *
   * @param mappings new value of mappings
   */
  public void setMappings(MappingSet mappings)
  {
    MappingSet oldMappings = this.mappings;
    this.mappings = mappings;
    firePropertyChange(PROP_MAPPINGS, oldMappings, mappings);
    if (mappings != null)
    {
      this.setCurrentMappings(mappings.clone());
    }
  }

  /**
   * Get the value of material
   *
   * @return the value of material
   */
  public MaterialProfile getMaterial()
  {
    return material;
  }

  /**
   * Set the value of material
   *
   * @param material new value of material
   */
  public void setMaterial(MaterialProfile material)
  {
    MaterialProfile oldMaterial = this.material;
    this.material = material;
    firePropertyChange(PROP_MATERIAL, oldMaterial, material);
    this.mappingListModel.setMaterial(material);
    this.jCheckBox1.setEnabled(material != null);
  }
  protected GraphicSet graphicElements = new GraphicSet();
  public static final String PROP_GRAPHICELEMENTS = "graphicElements";

  /**
   * Get the value of graphicElements
   *
   * @return the value of graphicElements
   */
  public GraphicSet getGraphicElements()
  {
    return graphicElements;
  }

  /**
   * Set the value of graphicElements
   *
   * @param graphicElements new value of graphicElements
   */
  public void setGraphicElements(GraphicSet graphicElements)
  {
    GraphicSet oldGraphicElements = this.graphicElements;
    this.graphicElements = graphicElements;
    firePropertyChange(PROP_GRAPHICELEMENTS, oldGraphicElements, graphicElements);
  }

private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
  //OK => Move localMappings to global Mappings an dispose
  this.setMappings(this.getCurrentMappings());
  this.setVisible(false);
}//GEN-LAST:event_okButtonActionPerformed

private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
  //Abort => reload the original Settings and dispose
  this.setMappings(null);
  this.setVisible(false);
}//GEN-LAST:event_cancelButtonActionPerformed

private void matchingPartsPanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_matchingPartsPanel1PropertyChange
  if (evt.getPropertyName().equals(MatchingPartsPanel.PROP_RENDERINGPROGRESS))
  {
    if (this.matchingPartsPanel1.getRenderingProgress() == -1)
    {
      this.progressBar.setIndeterminate(true);
    }
    else
    {
      this.progressBar.setIndeterminate(false);
      int val = this.matchingPartsPanel1.getRenderingProgress();
      this.progressBar.setValue(val == 100 ? 0 : val);
    }
  }
}//GEN-LAST:event_matchingPartsPanel1PropertyChange
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private com.t_oster.visicut.gui.mappingdialog.LaserProfilesPanel cuttingProfilesPanel1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private com.t_oster.visicut.gui.mappingdialog.MappingJTree mappingJTree;
    private com.t_oster.visicut.gui.mappingdialog.MappingTable mappingTable1;
    private com.t_oster.visicut.gui.mappingdialog.MatchingPartsPanel matchingPartsPanel1;
    private javax.swing.JLabel nameLB;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton okButton;
    private javax.swing.JProgressBar progressBar;
    private com.t_oster.visicut.gui.beans.SelectThumbnailButton selectThumbnailButton1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
