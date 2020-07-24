package blockchain;

public class Main {
    public static void main(String[] args) {
        BlockChain blockChain = new BlockChain();

        for(int i = 0; i < 5 ; i++){
            blockChain.addBlock();
        }

        for (int i = 0; i < 5; i++){
            Block block = blockChain.getBlock(i);
            System.out.println("Block:");
            System.out.println("Id: " + block.getId());
            System.out.println("Timestamp: " + block.getTimeStamp());
            System.out.println("Hash of the previous block:");
            System.out.println(block.getPreviousBlockHash());
            System.out.println("Hash of the block:");
            System.out.println(block.getHash());
            System.out.println();

        }
    }
}
