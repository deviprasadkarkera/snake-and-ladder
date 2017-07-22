package com.example.snakeladder;
import java.util.*;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PlayActivity extends Activity implements OnClickListener {
	ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9,iv10,iv11,iv12,iv13,iv14,iv15,iv16,iv17,iv18,iv19,iv20,iv21,iv22,iv23,iv24,iv25,temp,temp1,p1,p2;
	
	ImageButton rollbtn;
	TextView scoretxtview,dicescoretxtview,palyer2scoretxtview;
	int pos=0;
	int pos1=0;
	int currpos=0;
	int flag=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.activity_play);
		// Toast.makeText(this, "Entered Start", Toast.LENGTH_SHORT).show();
		 iv1=(ImageView) findViewById(R.id.imageView1);
		 iv2=(ImageView) findViewById(R.id.imageView2);
		 iv3=(ImageView) findViewById(R.id.imageView3);
		 iv4=(ImageView) findViewById(R.id.imageView4);
		 iv5=(ImageView) findViewById(R.id.imageView5);
		 iv6=(ImageView) findViewById(R.id.imageView6);
		 iv7=(ImageView) findViewById(R.id.imageView7);
		 iv8=(ImageView) findViewById(R.id.imageView8);
		 iv9=(ImageView) findViewById(R.id.imageView9);
		 iv10=(ImageView) findViewById(R.id.imageView10);
		 iv11=(ImageView) findViewById(R.id.imageView11);
		 iv12=(ImageView) findViewById(R.id.imageView12);
		 iv13=(ImageView) findViewById(R.id.imageView13);
		 iv14=(ImageView) findViewById(R.id.imageView14);
		 iv15=(ImageView) findViewById(R.id.imageView15);
		 iv16=(ImageView) findViewById(R.id.imageView16);
		 iv17=(ImageView) findViewById(R.id.imageView17);
		 iv18=(ImageView) findViewById(R.id.imageView18);
		 iv19=(ImageView) findViewById(R.id.imageView19);
		 iv20=(ImageView) findViewById(R.id.imageView20);
		 iv21=(ImageView) findViewById(R.id.imageView21);
		 iv22=(ImageView) findViewById(R.id.imageView22);
		 iv23=(ImageView) findViewById(R.id.imageView23);
		 iv24=(ImageView) findViewById(R.id.imageView24);
		 iv25=(ImageView) findViewById(R.id.imageView25);
		 temp=(ImageView) findViewById(R.id.player1imageView);
		 temp1= (ImageView) findViewById(R.id.player2imageView);
		 p1=(ImageView) findViewById(R.id.player1imageView);
		 p2= (ImageView) findViewById(R.id.player2imageView);
		 
	//	 commenttxtview=(TextView) findViewById(R.id.commenttextView);
		 scoretxtview=(TextView) findViewById(R.id.scoretextView);
		 palyer2scoretxtview=(TextView) findViewById(R.id.palyer2textView);
		 dicescoretxtview=(TextView) findViewById(R.id.dicescoretextView);
		 rollbtn=(ImageButton) findViewById(R.id.rolldiceimageButton);
		 rollbtn.setOnClickListener(this);
		 
	}
	@Override
	public void onClick(View v) {
		// Toast.makeText(this, "Entered click v", Toast.LENGTH_SHORT).show();
		// TODO Auto-generated method stub
		iv1.setVisibility(View.INVISIBLE);
		iv2.setVisibility(View.INVISIBLE);
		iv3.setVisibility(View.INVISIBLE);
		iv4.setVisibility(View.INVISIBLE);
		iv5.setVisibility(View.INVISIBLE);
		iv6.setVisibility(View.INVISIBLE);
		iv7.setVisibility(View.INVISIBLE);
		iv8.setVisibility(View.INVISIBLE);
		iv9.setVisibility(View.INVISIBLE);
		iv10.setVisibility(View.INVISIBLE);
		iv11.setVisibility(View.INVISIBLE);
		iv12.setVisibility(View.INVISIBLE);
		iv13.setVisibility(View.INVISIBLE);
		iv14.setVisibility(View.INVISIBLE);
		iv15.setVisibility(View.INVISIBLE);
		iv16.setVisibility(View.INVISIBLE);
		iv17.setVisibility(View.INVISIBLE);
		iv18.setVisibility(View.INVISIBLE);
		iv19.setVisibility(View.INVISIBLE);
		iv20.setVisibility(View.INVISIBLE);
		iv21.setVisibility(View.INVISIBLE);
		iv22.setVisibility(View.INVISIBLE);
		iv23.setVisibility(View.INVISIBLE);
		iv24.setVisibility(View.INVISIBLE);
		iv25.setVisibility(View.INVISIBLE);
		temp.setVisibility(View.VISIBLE);
		temp1.setVisibility(View.VISIBLE);
		
		
		if(pos==0){
		//	Toast.makeText(this, "p1 setted visible", Toast.LENGTH_SHORT).show();
			p1.setVisibility(View.VISIBLE);
		}else{
			p1.setVisibility(View.INVISIBLE);
		}
		if(pos1==0){
		//	Toast.makeText(this, "p2 setted visible", Toast.LENGTH_SHORT).show();
			p2.setVisibility(View.VISIBLE);
		}else{
			p2.setVisibility(View.INVISIBLE);
		}
	//	if(flag==0){
	//		Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
	//	}else if(flag==1){
	//		Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		
	//	}
	
		
		 Random rand = new Random();
		   int n=0;
		while(n==0){
		  n = rand.nextInt(7);
		    }
		setcoin(n);
		
		dicescoretxtview.setText(n+"");
		
	}
	private void setcoin(int n) {
		// TODO Auto-generated method stub
		
		if(flag==0){
		int curr;
		curr=pos;
		pos=pos+n;
	
		if(pos>25){
			Toast.makeText(this, "Player 1:Sorry Try Next Time", Toast.LENGTH_SHORT).show();
			pos=curr;
			flag=1;
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
			
		}
		if(pos==1){
			iv1.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv1.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView1);
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==2){
			iv2.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv2.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView2);
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==3){
			iv3.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv3.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView3);
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==4){
			iv4.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv4.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView4);
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==5){
			iv5.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv5.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView5);
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==6){
			pos=pos+12;
			iv18.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv18.setVisibility(1);
			flag=0;
			Toast.makeText(this, "Congrats! Roll Again ", Toast.LENGTH_SHORT).show();
			temp=(ImageView) findViewById(R.id.imageView18);
		}else if(pos==7){
			iv7.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv7.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView7);
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==8){
			pos=pos-4;
			iv4.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv4.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView4);
			Toast.makeText(this, "Oops!!!Got Bite Player 2's Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==9){
			iv9.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv9.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView9);
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==10){
			pos=pos+2;
			iv12.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv12.setVisibility(1);
			flag=0;
			Toast.makeText(this, "Congrats! Roll Again ", Toast.LENGTH_SHORT).show();
			temp=(ImageView) findViewById(R.id.imageView12);
		}else if(pos==11){
			iv11.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv11.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView11);
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==12){
			iv12.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv12.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView12);
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==13){
			iv13.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv13.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView13);
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==14){
			iv14.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv14.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView14);
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==15){
			pos=pos+1;
			iv16.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv16.setVisibility(1);
			flag=0;
			temp=(ImageView) findViewById(R.id.imageView16);
			Toast.makeText(this, "Congrats! Roll Again ", Toast.LENGTH_SHORT).show();
		}else if(pos==16){
			iv16.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv16.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView16);
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==17){
			iv17.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv17.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView17);
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==18){
			iv18.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv18.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView18);
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==19){
			iv19.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv19.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView19);
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==20){
			pos=pos-8;
			iv12.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv12.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView12);
			Toast.makeText(this, "Oops!!!Got Bite Player 2's Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==21){
			iv21.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv21.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView21);
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==22){
			pos=pos-5;
			iv17.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv17.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView17);
			Toast.makeText(this, "Oops!!!Got Bite Player 2's Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==23){
			iv23.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv23.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView23);
			Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==24){
			pos=pos-10;
			iv14.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv14.setVisibility(1);
			flag=1;
			temp=(ImageView) findViewById(R.id.imageView14);
			Toast.makeText(this, "Oops!!!Got Bite Player 2's Turn", Toast.LENGTH_SHORT).show();
		}else if(pos==25){
			iv25.setImageResource(R.drawable.coin);
			temp.setVisibility(View.INVISIBLE);
			iv25.setVisibility(1);
			Toast.makeText(this, "Player 1 Wins", Toast.LENGTH_SHORT).show();
			Toast.makeText(this, "Play Again!", Toast.LENGTH_SHORT).show();
			pos=0;
			pos1=0;
			palyer2scoretxtview.setText(pos1+"");
			temp1.setVisibility(View.INVISIBLE);
			p2.setVisibility(1);
			temp.setVisibility(View.INVISIBLE);
			p1.setVisibility(1);
			temp1=(ImageView) findViewById(R.id.player2imageView);
			
		}
	
		
		scoretxtview.setText(pos+"");
		
		
	}else if(flag==1){
		int curr1;
		curr1=pos1;
		pos1=pos1+n;
		if(pos1>25){
			Toast.makeText(this, "Player2:Sorry Try Next Time", Toast.LENGTH_SHORT).show();
			pos1=curr1;
			flag=1;
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}
		if(pos1==1){
			iv1.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv1.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView1);
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==2){
			iv2.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv2.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView2);
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==3){
			iv3.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv3.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView3);
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==4){
			iv4.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv4.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView4);
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==5){
			iv5.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv5.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView5);
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==6){
			pos1=pos1+12;
			iv18.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv18.setVisibility(1);
			flag=1;
			Toast.makeText(this, "Congrats! Roll Again ", Toast.LENGTH_SHORT).show();
			temp1=(ImageView) findViewById(R.id.imageView18);
		}else if(pos1==7){
			iv7.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv7.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView7);
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==8){
			pos1=pos1-4;
			iv4.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv4.setVisibility(1);
			flag=0;
			Toast.makeText(this, "Oops!!!Got Bite Player 1's Turn", Toast.LENGTH_SHORT).show();
			temp1=(ImageView) findViewById(R.id.imageView4);
		}else if(pos1==9){
			iv9.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv9.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView9);
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==10){
			pos1=pos1+2;
			iv12.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv12.setVisibility(1);
			flag=1;
			Toast.makeText(this, "Congrats! Roll Again ", Toast.LENGTH_SHORT).show();
			temp1=(ImageView) findViewById(R.id.imageView12);
		}else if(pos1==11){
			iv11.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv11.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView11);
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==12){
			iv12.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv12.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView12);
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==13){
			iv13.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv13.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView13);
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==14){
			iv14.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv14.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView14);
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==15){
			pos1=pos1+1;
			iv16.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv16.setVisibility(1);
			flag=1;
			temp1=(ImageView) findViewById(R.id.imageView16);
			Toast.makeText(this, "Congrats! Roll Again ", Toast.LENGTH_SHORT).show();
		}else if(pos1==16){
			iv16.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv16.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView16);
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==17){
			iv17.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv17.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView17);
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==18){
			iv18.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv18.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView18);
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==19){
			iv19.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv19.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView19);
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==20){
			pos1=pos1-8;
			iv12.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv12.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView12);
			Toast.makeText(this, "Oops!!!Got Bite Player 1's Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==21){
			iv21.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv21.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView21);
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==22){
			pos1=pos1-5;
			iv17.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv17.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView17);
			Toast.makeText(this, "Oops!!!Got Bite Player 1's Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==23){
			iv23.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv23.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView23);
			Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==24){
			pos1=pos1-10;
			iv14.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv14.setVisibility(1);
			flag=0;
			temp1=(ImageView) findViewById(R.id.imageView14);
			Toast.makeText(this, "Oops!!!Got Bite Player 1's Turn", Toast.LENGTH_SHORT).show();
		}else if(pos1==25){
			iv25.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.INVISIBLE);
			iv25.setVisibility(1);
			Toast.makeText(this, "Player 2 Wins", Toast.LENGTH_SHORT).show();
			Toast.makeText(this, "Play Again!", Toast.LENGTH_SHORT).show();
			pos1=0;
			pos=0;
			scoretxtview.setText(pos+"");
			temp=(ImageView) findViewById(R.id.player1imageView);
			temp.setVisibility(View.INVISIBLE);
			p1.setVisibility(1);
			temp1.setVisibility(View.INVISIBLE);
			p2.setVisibility(1);
		}
	
		
		palyer2scoretxtview.setText(pos1+"");
		
	}
		if(pos1==pos&&pos!=0&&flag==1){
			Toast.makeText(this, "Congrats! You Have Smashed Player1 Roll Again", Toast.LENGTH_SHORT).show();
			//temp1.setImageResource(R.drawable.coin1);
			temp1.setVisibility(View.VISIBLE);
			temp.setVisibility(View.INVISIBLE);
			p1.setVisibility(1);
			pos=0;
			flag=1;
			scoretxtview.setText(pos+"");
			
		}
		else if(pos==pos1&&pos!=0&&flag==0){
			Toast.makeText(this, "Congrats! You Have Smashed Player2 Roll Again", Toast.LENGTH_SHORT).show();
			//temp.setImageResource(R.drawable.coin);
			temp.setVisibility(View.VISIBLE);
			temp1.setVisibility(View.INVISIBLE);
			p2.setVisibility(1);
			pos1=0;
			flag=0;
			palyer2scoretxtview.setText(pos1+"");
		}
	
	}
}
