package com.exxeta.iss.sonar.msgflow.model;
/**
 * The class is a model of a message flow connection the properties of 
 * message flow connections. "Added for ABN"
 * 
 * @author Sapna Singh
 */
public class MessageFlowConnection {
	/**
	 * a source node ID of the connection
	 */
	private String srcNode;
	/**
	 * Display Name of the source node of the connection
	 */
	private String srcNodeName;
	/**
	 * a target node ID of the connection
	 */
	private String targetNode;
	/**
	 * Display Name of the target node ID of the connection
	 */
	private String targetNodeName;
	/**
	 * a source terminal of the connection
	 */
	private String srcTerminal;
	/**
	 * a target terminal of the connection
	 */
	private String targetTerminal;
	
	public MessageFlowConnection(){
		
	}
	
	public MessageFlowConnection(String srcNode, String srcNodeName, String targetNode, String targetNodeName,
			String srcTerminal, String targetTerminal) {
		super();
		this.srcNode = srcNode;
		this.srcNodeName = srcNodeName;
		this.targetNode = targetNode;
		this.targetNodeName = targetNodeName;
		this.srcTerminal = srcTerminal;
		this.targetTerminal = targetTerminal;
	}

	/**
	 * The method returns the ID of the source Node.
	 * 
	 * @return a ID of the source Node.
	 */
	public String getSrcNode() {
		return srcNode;
	}
	/**
	 * The method returns the Display Name of the source Node.
	 * 
	 * @return a Display Name of the source Node.
	 */
	public String getSrcNodeName() {
		return srcNodeName;
	}
	/**
	 * The method returns the ID of the target Node.
	 * 
	 * @return a ID of the target Node.
	 */
	public String getTargetNode() {
		return targetNode;
	}
	/**
	 * The method returns the Display Name of the target Node.
	 * 
	 * @return a Display Name of the target Node.
	 */
	public String getTargetNodeName() {
		return targetNodeName;
	}
	/**
	 * The method returns the source terminal.
	 * 
	 * @return a name of the source terminal.
	 */
	public String getSrcTerminal() {
		return srcTerminal;
	}
	/**
	 * The method returns the target terminal.
	 * 
	 * @return a name of the target terminal.
	 */
	public String getTargetTerminal() {
		return targetTerminal;
	}
	
}
