package com.network;

import java.io.Serializable;



public class NodeHelloMessage extends Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 17622242180470L;
	
	public NodeHelloMessage(){
		
		
	}
	
	
	NodeInfo nodeInfo;
	
	public NodeHelloMessage(NodeInfo nodeInfo){
		this.nodeInfo=nodeInfo;
	}
	
	
	

}
