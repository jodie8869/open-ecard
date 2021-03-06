/****************************************************************************
 * Copyright (C) 2012 ecsec GmbH.
 * All rights reserved.
 * Contact: ecsec GmbH (info@ecsec.de)
 *
 * This file is part of the Open eCard App.
 *
 * GNU General Public License Usage
 * This file may be used under the terms of the GNU General Public
 * License version 3.0 as published by the Free Software Foundation
 * and appearing in the file LICENSE.GPL included in the packaging of
 * this file. Please review the following information to ensure the
 * GNU General Public License version 3.0 requirements will be met:
 * http://www.gnu.org/copyleft/gpl.html.
 *
 * Other Usage
 * Alternatively, this file may be used in accordance with the terms
 * and conditions contained in a signed written agreement between
 * you and ecsec GmbH.
 *
 ***************************************************************************/

package org.openecard.gui.definition;


/**
 * Definition class for text fields.
 * Text fields have a field where text can be input.
 *
 * @author Tobias Wich
 */
public final class TextField extends AbstractTextField {

    /**
     * Creates a new TextField instance and initializes it with the given ID.
     *
     * @param id The ID to initialize the instance with.
     */
    public TextField(String id) {
	super(id);
    }

    @Override
    public InfoUnitElementType type() {
	return InfoUnitElementType.TEXT_FIELD;
    }

}
