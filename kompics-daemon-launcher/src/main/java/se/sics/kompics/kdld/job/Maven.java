package se.sics.kompics.kdld.job;

import se.sics.kompics.PortType;
import se.sics.kompics.kdld.daemon.JobStopRequest;


/**
 * The <code>Maven</code> class.
 * 
 * @author Jim Dowling <jdowling@sics.se>
 * @author Cosmin Arad <cosmin@sics.se>
 */
public class Maven extends PortType {

	{
		negative(JobAssembly.class);
		negative(JobExec.class);
		negative(JobStopRequest.class);
		positive(JobAssemblyResponse.class);
		positive(JobExecResponse.class);
	}
}
