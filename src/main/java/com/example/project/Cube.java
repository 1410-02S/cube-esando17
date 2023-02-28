package com.example.project;

public class Cube {
	//Array that has all of the colors and loctions 
	String[][]cubeLocation = {
		{"r","r","r","r","r","r","r","r","r"},
		{"b","b","b","b","b","b","b","b","b"},
		{"o","o","o","o","o","o","o","o","o"},
		{"g","g","g","g","g","g","g","g","g"},
		{"y","y","y","y","y","y","y","y","y"},
		{"w","w","w","w","w","w","w","w","w"}		
		};

	class edgeAssignment{
		public int currentFace;
		int[] rightEdge = new int[4];
		int[] topEdge = new int[4];
		int[] leftEdge = new int[4];
		int[] bottomEdge = new int[4];


		public edgeAssignment(int face){
			currentFace = face;
			switch(face){
				case 0: //face red
				 	rightEdge [0] = 1;//refers to the overall side color - blue
					rightEdge [1] = 2;//location number of the side color 
					rightEdge [2] = 5;
					rightEdge [3] = 8;

					topEdge [0] = 4; //color yellow
					topEdge [1] = 8;
					topEdge [2] = 5;
					topEdge [3] = 2;

					leftEdge [0] = 3; //green 
					leftEdge [1] = 0;
					leftEdge [2] = 3;
					leftEdge [3] = 6; 

					bottomEdge [0] = 5; // white
					bottomEdge [1] = 2;
					bottomEdge [2] = 5;
					bottomEdge [3] = 8;
				break;
					
				
				case 1: // blue face
					rightEdge [0] = 2;//refers to the overall side color - orange
					rightEdge [1] = 2;//location number of the side color 
					rightEdge [2] = 5;
					rightEdge [3] = 8;

					topEdge [0] = 4; //color yellow
					topEdge [1] = 6;
					topEdge [2] = 7;
					topEdge [3] = 8;

					leftEdge [0] = 0; //red 
					leftEdge [1] = 0;
					leftEdge [2] = 3;
					leftEdge [3] = 6; 

					bottomEdge [0] = 5; // white
					bottomEdge [1] = 0;
					bottomEdge [2] = 1;
					bottomEdge [3] = 2;
				break;

				case 2: //orange face
					rightEdge [0] = 3;//refers to the overall side color - green
					rightEdge [1] = 2;//location number of the side color 
					rightEdge [2] = 5;
					rightEdge [3] = 8;

					topEdge [0] = 4; //color yellow
					topEdge [1] = 0;
					topEdge [2] = 3;
					topEdge [3] = 6;

					leftEdge [0] = 1; //blue 
					leftEdge [1] = 0;
					leftEdge [2] = 3;
					leftEdge [3] = 6; 

					bottomEdge [0] = 5; // white
					bottomEdge [1] = 6;
					bottomEdge [2] = 3;
					bottomEdge [3] = 0;
				break;
				case 3: //green face
					rightEdge [0] = 0;//refers to the overall side color - red
					rightEdge [1] = 2;//location number of the side color 
					rightEdge [2] = 5;
					rightEdge [3] = 8;

					topEdge [0] = 4; //color yellow
					topEdge [1] = 2;
					topEdge [2] = 1;
					topEdge [3] = 0;

					leftEdge [0] = 2; //orange 
					leftEdge [1] = 0;
					leftEdge [2] = 3;
					leftEdge [3] = 6; 

					bottomEdge [0] = 5; // white
					bottomEdge [1] = 8;
					bottomEdge [2] = 7;
					bottomEdge [3] = 6;
				break;

				case 4: //yellow face
				rightEdge [0] = 2;//refers to the overall side color - orange
				rightEdge [1] = 0;//location number of the side color 
				rightEdge [2] = 1;
				rightEdge [3] = 2;

				topEdge [0] = 3; //color green
				topEdge [1] = 2;
				topEdge [2] = 1;
				topEdge [3] = 0;

				leftEdge [0] = 0; //red 
				leftEdge [1] = 2;
				leftEdge [2] = 1;
				leftEdge [3] = 0; 

				bottomEdge [0] = 1; // blue
				bottomEdge [1] = 0;
				bottomEdge [2] = 1;
				bottomEdge [3] = 2;
				break;

				case 5: //white face 
					rightEdge [0] = 2;//refers to the overall side color - orange 
					rightEdge [1] = 8;//location number of the side color 
					rightEdge [2] = 7;
					rightEdge [3] = 6;

					topEdge [0] = 1; //color blue
					topEdge [1] = 6;
					topEdge [2] = 7;
					topEdge [3] = 8;

					leftEdge [0] = 0; //red 
					leftEdge [1] = 6;
					leftEdge [2] = 7;
					leftEdge [3] = 8; 

					bottomEdge [0] = 3; // green
					bottomEdge [1] = 8;
					bottomEdge [2] = 7;
					bottomEdge [3] = 6;
				break;
			}
		}
	}
	public void turnFace(int index, String direction){
		edgeAssignment eFace = new edgeAssignment(index);

		String[][] copy = new ()String [6][9]
		
				for (int i = 0; i<6; i++){
					for(int j=0; j<9; j++){
						copy[i][j] = cube[i][j];
					}
				}
		
				switch(direction){
				case "clockwise":
					//how the face numbers change
					cube[eFace.currentFace][0] = copy[eFace.currentFace][2];
					cube[eFace.currentFace][1] = copy[eFace.currentFace][5];
					cube[eFace.currentFace][2] = copy[eFace.currentFace][8];
					cube[eFace.currentFace][3] = copy[eFace.currentFace][3];
					cube[eFace.currentFace][5] = copy[eFace.currentFace][7];
					cube[eFace.currentFace][6] = copy[eFace.currentFace][0];
					cube[eFace.currentFace][7] = copy[eFace.currentFace][3];
					cube[eFace.currentFace][8] = copy[eFace.currentFace][6];
		
					// right edge change 
					cube[eFace.rightEdge[0]][eFace.rightEdge[1]] = copy[eFace.bottomEdge[0]][eFace.bottomEdge[1]];
					cube[eFace.rightEdge[0]][eFace.rightEdge[2]] = copy[eFace.bottomEdge[0]][eFace.bottomEdge[2]];
					cube[eFace.rightEdge[0]][eFace.rightEdge[3]] = copy[eFace.bottomEdge[0]][eFace.bottomEdge[3]];
					
					//top edge change 
					cube[eFace.topEdge[0]][eFace.topEdge[1]] = copy[eFace.rightEdge[0]][eFace.rightEdge[1]];
					cube[eFace.topEdge[0]][eFace.topEdge[2]] = copy[eFace.rightEdge[0]][eFace.rightEdge[2]];
					cube[eFace.topEdge[0]][eFace.topEdge[3]] = copy[eFace.rightEdge[0]][eFace.rightEdge[3]];
		
					//left edge change 
					cube[eFace.leftEdge[0]][eFace.leftEdge[1]] = copy[eFace.topEdge[0]][eFace.topEdge[1]];
					cube[eFace.leftEdge[0]][eFace.leftEdge[2]] = copy[eFace.topEdge[0]][eFace.topEdge[2]];
					cube[eFace.leftEdge[0]][eFace.leftEdge[3]] = copy[eFace.topEdge[0]][eFace.topEdge[3]];
		
					//bottom edge change
					cube[eFace.bottomEdge[0]][eFace.bottomEdge[1]] = copy[eFace.leftEdge[0]][eFace.leftEdge[1]];
					cube[eFace.bottomEdge[0]][eFace.bottomEdge[2]] = copy[eFace.leftEdge[0]][eFace.leftEdge[2]];
					cube[eFace.bottomEdge[0]][eFace.bottomEdge[3]] = copy[eFace.leftEdge[0]][eFace.leftEdge[3]];
			break;
			case "counterClockwise":
					// how the face numbers move 
					cube[eFace.currentFace][0] = copy[eFace.currentFace][6];
					cube[eFace.currentFace][1] = copy[eFace.currentFace][3];
					cube[eFace.currentFace][2] = copy[eFace.currentFace][0];
					cube[eFace.currentFace][3] = copy[eFace.currentFace][7];
					cube[eFace.currentFace][5] = copy[eFace.currentFace][1];
					cube[eFace.currentFace][6] = copy[eFace.currentFace][2];
					cube[eFace.currentFace][7] = copy[eFace.currentFace][5];
					cube[eFace.currentFace][8] = copy[eFace.currentFace][8];

				//right edge movement
					cube[eFace.rightEdge[0]][eFace.rightEdge[1]] = copy[eFace.topEdge[0]][eFace.topEdge[1]];
					cube[eFace.rightEdge[0]][eFace.rightEdge[2]] = copy[eFace.topEdge[0]][eFace.topEdge[2]];
					cube[eFace.rightEdge[0]][eFace.rightEdge[3]] = copy[eFace.topEdge[0]][eFace.topEdge[3]];

				//top edge movement
					cube[eFace.topEdge[0]][eFace.topEdge[1]] = copy[eFace.leftEdge[0]][eFace.leftEdge[1]];
					cube[eFace.topEdge[0]][eFace.topEdge[2]] = copy[eFace.leftEdge[0]][eFace.leftEdge[2]];
					cube[eFace.topEdge[0]][eFace.topEdge[3]] = copy[eFace.leftEdge[0]][eFace.leftEdge[3]];

				// left edge movement
					cube[eFace.leftEdge[0]][eFace.leftEdge[1]] = copy[eFace.bottomEdge[0]][eFace.bottomEdge[1]];
					cube[eFace.leftEdge[0]][eFace.leftEdge[2]] = copy[eFace.bottomEdge[0]][eFace.bottomEdge[2]];
					cube[eFace.leftEdge[0]][eFace.leftEdge[3]] = copy[eFace.bottomEdge[0]][eFace.bottomEdge[3]];

				// bottom edge movement
					cube[eFace.bottomEdge[0]][eFace.bottomEdge[1]] = copy[eFace.rightEdge[0]][eFace.rightEdge[1]];
					cube[eFace.bottomEdge[0]][eFace.bottomEdge[2]] = copy[eFace.rightEdge[0]][eFace.rightEdge[2]];
					cube[eFace.bottomEdge[0]][eFace.bottomEdge[3]] = copy[eFace.rightEdge[0]][eFace.rightEdge[3]];
			break;
		}

			
	}
		public void start(){
	
	}

	public void print(){
	
		for (int x=0; x<6; x++){
			for(int y=0; y<3; y++){
				for(int z=0; z<3; z++){
					System.out.print(cubeLocation[x][y+z]);
				}
				System.out.println();
			}

			System.out.println();	
		} 
			
		}
	public void face(){

	}
	}





