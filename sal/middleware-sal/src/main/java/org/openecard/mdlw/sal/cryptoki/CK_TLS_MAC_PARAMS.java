package org.openecard.mdlw.sal.cryptoki;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : pkcs11_v2.40/pkcs11t.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CK_TLS_MAC_PARAMS extends Structure {
	/** C type : CK_MECHANISM_TYPE */
	public long prfHashMechanism;
	public long getPrfHashMechanism() {
		return prfHashMechanism;
	}
	public void setPrfHashMechanism(long prfHashMechanism) {
		this.prfHashMechanism = prfHashMechanism;
	}
	/** C type : CK_ULONG */
	public long ulMacLength;
	public long getUlMacLength() {
		return ulMacLength;
	}
	public void setUlMacLength(long ulMacLength) {
		this.ulMacLength = ulMacLength;
	}
	/** C type : CK_ULONG */
	public long ulServerOrClient;
	public long getUlServerOrClient() {
		return ulServerOrClient;
	}
	public void setUlServerOrClient(long ulServerOrClient) {
		this.ulServerOrClient = ulServerOrClient;
	}
	public CK_TLS_MAC_PARAMS() {
		super();
	}
	 protected List<String> getFieldOrder() {
		return Arrays.asList("prfHashMechanism", "ulMacLength", "ulServerOrClient");
	}
	/**
	 * @param prfHashMechanism C type : CK_MECHANISM_TYPE<br>
	 * @param ulMacLength C type : CK_ULONG<br>
	 * @param ulServerOrClient C type : CK_ULONG
	 */
	public CK_TLS_MAC_PARAMS(long prfHashMechanism, long ulMacLength, long ulServerOrClient) {
		super();
		this.prfHashMechanism = prfHashMechanism;
		this.ulMacLength = ulMacLength;
		this.ulServerOrClient = ulServerOrClient;
	}
	public CK_TLS_MAC_PARAMS(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CK_TLS_MAC_PARAMS implements Structure.ByReference {
		
	};
	public static class ByValue extends CK_TLS_MAC_PARAMS implements Structure.ByValue {
		
	};
}
