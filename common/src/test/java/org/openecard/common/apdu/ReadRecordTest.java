/****************************************************************************
 * Copyright (C) 2013 HS Coburg.
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

package org.openecard.common.apdu;

import org.openecard.common.util.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test if the READ RECORD commands are constructed as expected.
 *
 * @author Dirk Petrautzki
 */
public class ReadRecordTest {

    @Test
    public void test() {
	ReadRecord readRecord = new ReadRecord();
	byte[] expected = StringUtils.toByteArray("00 B2 01 04 FF", true);
	Assert.assertEquals(readRecord.toByteArray(), expected);

	readRecord = new ReadRecord((byte) 0x02);
	expected = StringUtils.toByteArray("00 B2 02 04 FF", true);
	Assert.assertEquals(readRecord.toByteArray(), expected);

	readRecord = new ReadRecord((byte) 0x09, (byte) 0x02);
	expected = StringUtils.toByteArray("00 B2 02 4C FF", true);
	Assert.assertEquals(readRecord.toByteArray(), expected);

	readRecord = new ReadRecord((byte) 0x02, (short) 12, (short) 6);
	expected = StringUtils.toByteArray("00 B3 02 04 02 54 0C 06", true);
	Assert.assertEquals(readRecord.toByteArray(), expected);

	readRecord = new ReadRecord((byte) 0x09, (byte) 0x02, (short) 12, (short) 6);
	expected = StringUtils.toByteArray("00 B3 02 4C 02 54 0C 06", true);
	Assert.assertEquals(readRecord.toByteArray(), expected);
    }

}
