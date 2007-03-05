package com.mucommander.ui.action;

import com.mucommander.file.AbstractFile;
import com.mucommander.file.util.FileSet;
import com.mucommander.ui.CopyDialog;
import com.mucommander.ui.MainFrame;

import java.util.Hashtable;

/**
 * This action invokes the 'Copy dialog' which allows to copy the currently selected/marked files to a specified destination.
 * The only difference with {@link com.mucommander.ui.action.CopyAction} is that if a single file is selected,
 * the destination will be preset to the selected file's name so that it can easily be copied to a similar filename in
 * the current directory.
 *
 * @author Maxence Bernard
 */
public class LocalCopyAction extends SelectedFileAction {

    public LocalCopyAction(MainFrame mainFrame, Hashtable properties) {
        super(mainFrame, properties);
    }

    public void performAction() {
        AbstractFile selectedFile = mainFrame.getActiveTable().getSelectedFile(false);

        // Display local copy dialog only if a file other than '..' is currently selected
        if(selectedFile!=null) {
            new CopyDialog(mainFrame, new FileSet(selectedFile.getParent(), selectedFile), true).showDialog();
        }
    }
}
