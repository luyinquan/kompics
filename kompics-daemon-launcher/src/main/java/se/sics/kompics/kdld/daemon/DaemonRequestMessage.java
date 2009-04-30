package se.sics.kompics.kdld.daemon;

import se.sics.kompics.address.Address;
import se.sics.kompics.network.Message;

/**
 * The <code>DaemonRequestMessage</code> class.
 * 
 */
public abstract class DaemonRequestMessage extends Message {

	private static final long serialVersionUID = -1614907286221453619L;
	
	private final int daemonId;

	public DaemonRequestMessage(Address source, DaemonAddress destination) {
		super(source, destination.getPeerAddress());
		this.daemonId = destination.getDaemonId();
	}

	public int getDaemonId() {
		return daemonId;
	} 

}
