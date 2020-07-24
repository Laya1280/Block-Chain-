package blockchain;

class Block{
    int id;
    long timeStamp;
    String previousBlockHash;
    String hash;

    void setId(int id){
        this.id = id;
    }
    void setTimeStamp(long timeStamp){
        this.timeStamp = timeStamp;
    }
    void setPreviousBlockHash(String hash){
        this.previousBlockHash = hash;
    }
    void setHash( String hash) {
        this.hash = hash;
    }
    int getId(){
        return this.id;
    }
    long getTimeStamp(){
        return this.timeStamp;
    }
    String getPreviousBlockHash() {
        return this.previousBlockHash;
    }
    String getHash() {
        return this.hash;
    }

}