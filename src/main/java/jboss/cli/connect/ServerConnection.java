package jboss.cli.connect;

import org.jboss.as.cli.CliInitializationException;
import org.jboss.as.cli.CommandContext;
import org.jboss.as.cli.CommandContextFactory;
import org.jboss.as.cli.CommandLineException;

public class ServerConnection {
	
	String domainController = "localhost";
	int domainPort = 9990;
	
	CommandContext ctx;
	
	public ServerConnection () throws CommandLineException {
		CommandContextFactory.getInstance().newCommandContext("admin","admin".toCharArray());
	}
}
