package roadblock.biocompiler

class SequenceUpdate {
    public Integer partID
    public Integer location
    public String sequence
   
   new (Integer partID, Integer location, String newSequence){
   		this.partID = partID
   		this.location = location
   		this.sequence = newSequence
   }
}