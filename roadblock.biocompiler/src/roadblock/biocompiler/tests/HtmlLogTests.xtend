package roadblock.biocompiler.tests
import org.junit.Test
import static org.junit.Assert.*
import roadblock.biocompiler.HtmlLog

class HtmlLogTests {

	def removeDates(String s){
		return s.replaceAll('\\[([^\\]])*\\]','[]')
	}
		
	@Test
	def simpleManipulation(){ // checks that it works as a fifo
		var log = new HtmlLog(5)
		
		for(k: 1..3)
			log.addContent(k.toString)
		
		assertEquals(#[1..3].flatten.map["<TT>[]</TT>" + it.toString ].join('\n<br/>'), log.toString.removeDates)
				
		for(k: 4..10)
			log.addContent(k.toString)

		assertEquals(#[6..10].flatten.map["<TT>[]</TT>" + it.toString ].join('\n<br/>'), log.toString.removeDates
		)	
	}
	
	@Test 
	def htmlRendering(){
		var log = new HtmlLog(10)
		
		log.addText("some outputs")
		log.addWarning("some warning")
		log.addError("some error")
		
		var results = log.toHtml.removeDates

		assertEquals("<BODY BGCOLOR='#000000' TEXT='#FFFFFF'><TT>[]</TT><FONT COLOR = '#FFFFFF'><TT>some outputs</TT></FONT>
<br/><TT>[]</TT><FONT COLOR = '#00FF00'><TT>some warning</TT></FONT>
<br/><TT>[]</TT><FONT COLOR = '#FF0000'><TT>some error</TT></FONT></BODY>",results)	
		
		
	}
	
	@Test 
	def addLogTest(){
		var mainLog = new HtmlLog(10)
		var secondLog = new HtmlLog(5)
		
		for(k: 1..15)
			mainLog.addContent(k.toString)
			
		for(k: 100..110)
			secondLog.addContent(k.toString)
			
		mainLog.addLog(secondLog)
		
		var results = mainLog.toString.removeDates
		assertEquals(#[11..15, 106..110].flatten.map["<TT>[]</TT>" + it.toString ].join('\n<br/>'),results)	
		assertTrue(true)
	}
	

}