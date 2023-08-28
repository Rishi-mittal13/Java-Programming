private Node ektreebana(int[] in ,int[] pre, int startingindexesses, int endingindexes) {

			// write your code here
			 if(startingindexesses>endingindexes){
            return null;
        }



        Node nodewaliroot= new Node(pre[preIndex++]);




        int indexess=-1;



        for (int i = startingindexesses; i <=endingindexes ; i++) {
            if(in[i]==nodewaliroot.data){


                indexess=i;
                break;


    }
    
	
	
	 		   }

				
        nodewaliroot.left=ektreebana(in,pre,startingindexesses,indexess-1);
      				  nodewaliroot.right=ektreebana(in,pre,indexess+1,endingindexes);
     		   return nodewaliroot;
		}

	public void display() {
			this.display(this.root);
		}

				private void display(Node node) {
			if (node == null) {
				return;
			}

					String str = "";




					if (node.left != null) {
				str += node.left.data;
		} else {
				str += "END";
			}

					str += " => " + node.data + " <= ";

							if (node.right != null) {
				str += node.right.data;
						} else {
				str += "END";
	}

					System.out.println(str);

	this.display(node.left);
					this.display(node.right);
		}		

	}

}