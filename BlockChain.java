package blockchain;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Date;

class BlockChain{
     int id;
     String hash;
     ArrayList<Block>  blocks = new ArrayList<>();
     BlockChain() {
         id = 1;
         hash = "0";
     }
     Block addBlock() {
         Block block = new Block();
         block.id = id;
         block.timeStamp = new Date().getTime();
         block.previousBlockHash = hash;
         block.hash = StringUtil.applySha256(block.id+block.timeStamp+
                 block.previousBlockHash.toString());
         id += 1;
         hash = block.hash;
         blocks.add(block);
         return block;

     }

     Block getBlock (int i ){
         return blocks.get(i);
     }


}