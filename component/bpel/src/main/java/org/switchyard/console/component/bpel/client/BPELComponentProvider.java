/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved. 
 * See the copyright.txt in the distribution for a 
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use, 
 * modify, copy, or redistribute it subject to the terms and conditions 
 * of the GNU Lesser General Public License, v. 2.1. 
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details. 
 * You should have received a copy of the GNU Lesser General Public License, 
 * v.2.1 along with this distribution; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */
package org.switchyard.console.component.bpel.client;

import org.switchyard.console.components.client.extension.BaseComponentProvider;
import org.switchyard.console.components.client.extension.ComponentExtension;
import org.switchyard.console.components.client.ui.BaseComponentConfigurationView;
import org.switchyard.console.components.client.ui.ComponentConfigurationPresenter.ComponentConfigurationView;

/**
 * BPELComponentProvider
 * <p/>
 * ComponentProvider for the BPEL component.
 *
 * @author Rob Cernich
 */
@ComponentExtension(displayName = "BPEL", componentName = "org.switchyard.component.bpel", activationTypes = "bpel")
public class BPELComponentProvider extends BaseComponentProvider {

    @Override
    public ComponentConfigurationView createConfigurationView() {
        return new BaseComponentConfigurationView() {
            @Override
            protected String getComponentName() {
                return "BPEL";
            }
        };
    }

}
