package roadblock.biocompiler


import java.util.List
import java.util.Date

class HtmlLog {
	public Integer maximumSize = 0
	public List<String> content = newArrayList
	
	new(Integer maximumSize){
		this.maximumSize = maximumSize
		for(k: 1..this.maximumSize)
			content.add('')
	}
	
	def addContent(String contentString){
		content = content.drop(1).toList
		content.add("<TT>[" + (new Date) + "]</TT>" + contentString)
	}
	
	def addText(String contentString){
		println("Log: " +contentString)
		addContent("<FONT COLOR = '#FFFFFF'><TT>" + contentString + "</TT></FONT>")
	}

	def addWarning(String contentString){
		println("Log: " +contentString)
		addContent("<FONT COLOR = '#00FF00'><TT>" + contentString + "</TT></FONT>")
	}

	def addError(String contentString){
		println("Log: " +contentString)
		addContent("<FONT COLOR = '#FF0000'><TT>" + contentString + "</TT></FONT>")
	}

	
	override toString(){
		return content.filter[it!=''].join("\n<br/>")
	}
	
	def toHtml(){
		return "<BODY BGCOLOR='#000000' TEXT='#FFFFFF'>" + this.toString + "</BODY>" 
		
	}
	
	def addLog(HtmlLog newLog){
		var toAdd = newLog.content.filter[it!='']
		content = content.drop(toAdd.size).toList
		content.addAll(toAdd.toList)
	}
}