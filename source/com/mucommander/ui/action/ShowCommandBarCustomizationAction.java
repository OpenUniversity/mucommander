/*
 * This file is part of muCommander, http://www.mucommander.com
 * Copyright (C) 2002-2009 Maxence Bernard
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mucommander.ui.action;

import java.util.Hashtable;

import com.mucommander.ui.dialog.customization.CommandBarDialog;
import com.mucommander.ui.main.MainFrame;

/**
 * This action opens the dialog which allows the user to customize the command-bar.
 * 
 * @author Arik Hadas
 */
public class ShowCommandBarCustomizationAction extends MuAction implements InvokesDialog {
	
	public ShowCommandBarCustomizationAction(MainFrame mainFrame, Hashtable properties) {
        super(mainFrame, properties);
    }

    public void performAction() {CommandBarDialog.getDialog().showDialog();}
    
    public static class Factory implements MuActionFactory {

		public MuAction createAction(MainFrame mainFrame, Hashtable properties) {
			return new ShowCommandBarCustomizationAction(mainFrame, properties);
		}
    }
}