package csdn.shimiso.eim.activity.im;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import csdn.shimiso.eim.R;
import csdn.shimiso.eim.activity.LoginActivity;
import csdn.shimiso.eim.activity.MainActivity;
import csdn.shimiso.eim.manager.ContacterManager;
import csdn.shimiso.eim.manager.MessageManager;
import csdn.shimiso.eim.manager.XmppConnectionManager;
import csdn.shimiso.eim.model.IMMessage;
import csdn.shimiso.eim.model.User;
import csdn.shimiso.eim.util.StringUtil;

public class ButtonsActivity extends AChatActivity {

	// private ImageView titleBack;
	// private MessageListAdapter adapter = null;
	// private EditText messageInput = null;
	// private Button messageSendBtn = null;
	// private ImageButton userInfo;
	// private ListView listView;
	// private int recordCount;
	// private View listHead;
	// private Button listHeadButton;
	// private User user;// 聊天人
	// private TextView tvChatTitle;
	// private String to_name;
	// private ImageView iv_status;
	//
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buttons);
		// init();

		Button btn1 = (Button) findViewById(R.id.btn1);
		btn1.setOnClickListener(mViewClickListener);
		Button btn2 = (Button) findViewById(R.id.btn2);
		btn2.setOnClickListener(mViewClickListener);
		Button btn3 = (Button) findViewById(R.id.btn3);
		btn3.setOnClickListener(mViewClickListener);
		Button btn4 = (Button) findViewById(R.id.btn4);
		btn4.setOnClickListener(mViewClickListener);
		Button btn5 = (Button) findViewById(R.id.btn5);
		btn5.setOnClickListener(mViewClickListener);
		Button btn6 = (Button) findViewById(R.id.btn6);
		btn6.setOnClickListener(mViewClickListener);

	}

	android.view.View.OnClickListener mViewClickListener = new android.view.View.OnClickListener() {
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
			// long[] pattern = { 100, 400 };
			boolean vibrator_open = true;
			boolean audio_open = false;

			int id = v.getId();
			switch (id) {
			case R.id.btn1:
				try {
					sendMessage("1");
				} catch (Exception e) {
					showToast("信息发送失败");
				}
				if (vibrator_open)
					vibrator.vibrate(new long[] { 150, 200 }, -1);
				if (audio_open)
					play(R.raw.audio1);
				break;
			case R.id.btn2:
				// m.setBody("2");
				// chat.sendMessage(m);
				try {
					sendMessage("2");
				} catch (Exception e) {
					showToast("信息发送失败");
				}
				if (vibrator_open)
					vibrator.vibrate(new long[] { 150, 200, 150, 200 }, -1);
				if (audio_open)
					play(R.raw.audio2);
				break;
			case R.id.btn3:
				// m.setBody("3");
				// chat.sendMessage(m);
				try {
					sendMessage("3");
				} catch (Exception e) {
					showToast("信息发送失败");
				}
				if (vibrator_open)
					vibrator.vibrate(
							new long[] { 150, 200, 150, 200, 150, 200 }, -1);
				if (audio_open)
					play(R.raw.audio3);
				break;
			case R.id.btn4:
				// m.setBody("4");
				// chat.sendMessage(m);
				try {
					sendMessage("4");
				} catch (Exception e) {
					showToast("信息发送失败");
				}
				if (vibrator_open)
					vibrator.vibrate(new long[] { 150, 200, 150, 200, 150, 200,
							150, 200 }, -1);
				if (audio_open)
					play(R.raw.audio4);
				break;
			case R.id.btn5:
				// m.setBody("5");
				// chat.sendMessage(m);
				try {
					sendMessage("5");
				} catch (Exception e) {
					showToast("信息发送失败");
				}
				if (vibrator_open)
					vibrator.vibrate(new long[] { 150, 200, 150, 200, 150, 200,
							150, 200, 150, 200 }, -1);
				if (audio_open)
					play(R.raw.audio5);
				break;
			case R.id.btn6:
				// m.setBody("6");
				// chat.sendMessage(m);
				try {
					sendMessage("6");
				} catch (Exception e) {
					showToast("信息发送失败");
				}
				if (vibrator_open)
					vibrator.vibrate(new long[] { 150, 200, 150, 200, 150, 200,
							150, 200, 150, 200, 150, 200 }, -1);
				if (audio_open)
					play(R.raw.audio6);
				break;
			}
		}
	};

	//
	// private void init() {
	// titleBack = (ImageView) findViewById(R.id.title_back);
	// titleBack.setOnClickListener(new OnClickListener() {
	// @Override
	// public void onClick(View v) {
	// finish();
	// }
	// });
	// // iv_status=findViewById(R.id.)
	// // 与谁聊天
	// tvChatTitle = (TextView) findViewById(R.id.to_chat_name);
	// user = ContacterManager.getByUserJid(to, XmppConnectionManager
	// .getInstance().getConnection());
	// if (null == user) {
	// to_name = StringUtil.getUserNameByJid(to);
	// } else {
	// to_name = user.getName() == null ? user.getJID() : user.getName();
	//
	// }
	// tvChatTitle.setText(to_name);
	//
	// userInfo = (ImageButton) findViewById(R.id.user_info);
	// userInfo.setOnClickListener(new OnClickListener() {
	// @Override
	// public void onClick(View v) {
	// Intent intent = new Intent();
	// intent.setClass(context, FriendInfoActivity.class);
	// startActivity(intent);
	// }
	// });
	//
	// listView = (ListView) findViewById(R.id.chat_list);
	// listView.setCacheColorHint(0);
	// adapter = new MessageListAdapter(ChatActivity.this, getMessages(),
	// listView);
	//
	// // 头
	//
	// LayoutInflater mynflater = LayoutInflater.from(context);
	// listHead = mynflater.inflate(R.layout.chatlistheader, null);
	// listHeadButton = (Button) listHead.findViewById(R.id.buttonChatHistory);
	// listHeadButton.setOnClickListener(chatHistoryCk);
	// listView.addHeaderView(listHead);
	// listView.setAdapter(adapter);
	//
	// messageInput = (EditText) findViewById(R.id.chat_content);
	// messageSendBtn = (Button) findViewById(R.id.chat_sendbtn);
	// messageSendBtn.setOnClickListener(new View.OnClickListener() {
	//
	// @Override
	// public void onClick(View v) {
	// String message = messageInput.getText().toString();
	// if ("".equals(message)) {
	// Toast.makeText(ChatActivity.this, "不能为空",
	// Toast.LENGTH_SHORT).show();
	// } else {
	//
	// try {
	// sendMessage(message);
	// messageInput.setText("");
	// } catch (Exception e) {
	// showToast("信息发送失败");
	// messageInput.setText(message);
	// }
	// closeInput();
	// }
	// }
	// });
	// }
	//
	// @Override
	// protected void receiveNewMessage(IMMessage message) {
	//
	// }
	//
	// @Override
	// protected void refreshMessage(List<IMMessage> messages) {
	//
	// adapter.refreshList(messages);
	// }
	//
	// @Override
	// protected void onResume() {
	// super.onResume();
	// recordCount = MessageManager.getInstance(context)
	// .getChatCountWithSb(to);
	// if (recordCount <= 0) {
	// listHead.setVisibility(View.GONE);
	// } else {
	// listHead.setVisibility(View.VISIBLE);
	// }
	// adapter.refreshList(getMessages());
	// }
	//
	// private class MessageListAdapter extends BaseAdapter {
	//
	// private List<IMMessage> items;
	// private Context context;
	// private ListView adapterList;
	// private LayoutInflater inflater;
	//
	// public MessageListAdapter(Context context, List<IMMessage> items,
	// ListView adapterList) {
	// this.context = context;
	// this.items = items;
	// this.adapterList = adapterList;
	// }
	//
	// public void refreshList(List<IMMessage> items) {
	// this.items = items;
	// this.notifyDataSetChanged();
	// adapterList.setSelection(items.size() - 1);
	// }
	//
	// @Override
	// public int getCount() {
	// return items == null ? 0 : items.size();
	// }
	//
	// @Override
	// public Object getItem(int position) {
	// return items.get(position);
	// }
	//
	// @Override
	// public long getItemId(int position) {
	// return position;
	// }
	//
	// @Override
	// public View getView(int position, View convertView, ViewGroup parent) {
	// inflater = (LayoutInflater) context
	// .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	// IMMessage message = items.get(position);
	// if (message.getMsgType() == 0) {
	// convertView = this.inflater.inflate(
	// R.layout.formclient_chat_in, null);
	// } else {
	// convertView = this.inflater.inflate(
	// R.layout.formclient_chat_out, null);
	// }
	// TextView useridView = (TextView) convertView
	// .findViewById(R.id.formclient_row_userid);
	// TextView dateView = (TextView) convertView
	// .findViewById(R.id.formclient_row_date);
	// TextView msgView = (TextView) convertView
	// .findViewById(R.id.formclient_row_msg);
	// if (message.getMsgType() == 0) {
	// if (null == user) {
	// useridView.setText(StringUtil.getUserNameByJid(to));
	// } else {
	// useridView.setText(user.getName());
	// }
	//
	// } else {
	// useridView.setText("我");
	// }
	// dateView.setText(message.getTime());
	// msgView.setText(message.getContent());
	// return convertView;
	// }
	//
	// }
	//
	// @Override
	// public boolean onCreateOptionsMenu(Menu menu) {
	// MenuInflater inflater = getMenuInflater();
	// inflater.inflate(R.menu.chat_menu, menu);
	// return true;
	// }
	//
	// @Override
	// public boolean onOptionsItemSelected(MenuItem item) {
	// Intent intent = new Intent();
	// switch (item.getItemId()) {
	// case R.id.menu_return_main_page:
	// intent.setClass(context, MainActivity.class);
	// startActivity(intent);
	// finish();
	// break;
	// case R.id.menu_relogin:
	// intent.setClass(context, LoginActivity.class);
	// startActivity(intent);
	// finish();
	// break;
	// case R.id.menu_exit:
	// isExit();
	// break;
	// }
	// return true;
	//
	// }
	//
	// /**
	// * 点击进入聊天记录
	// */
	// private OnClickListener chatHistoryCk = new OnClickListener() {
	//
	// @Override
	// public void onClick(View v) {
	// Intent in = new Intent(context, ChatHistoryActivity.class);
	// in.putExtra("to", to);
	// startActivity(in);
	// }
	// };

	@Override
	protected void receiveNewMessage(IMMessage message) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void refreshMessage(List<IMMessage> messages) {
		// TODO Auto-generated method stub

	}

	public void play(int id) {
		// int byteread = 0;
		// byte[] buf = new byte[4096];
		// FileInputStream inStream = null;
		//
		// Resources res = getResources();
		// AssetFileDescriptor fd = res.openRawResourceFd(R.raw.audio1);
		//
		// try {
		// inStream = fd.createInputStream();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// try {
		// while ((byteread = inStream.read(buf)) != -1) {
		// // do something
		// }
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// String file = "//sdcard//testring.wav";
		// String tag = "22";
		byte[] buffer = null;
		AudioTrack at = null;
		int pcmlen = 0;

		try {
			Resources res = getResources();
			AssetFileDescriptor fd = res.openRawResourceFd(id);
			FileInputStream fis = fd.createInputStream();

			buffer = new byte[1024 * 1024 * 2];// 2M
			int len = fis.read(buffer);
			pcmlen = 0;
			pcmlen += buffer[0x2b];
			pcmlen = pcmlen * 256 + buffer[0x2a];
			pcmlen = pcmlen * 256 + buffer[0x29];
			pcmlen = pcmlen * 256 + buffer[0x28];

			int channel = buffer[0x17];
			channel = channel * 256 + buffer[0x16];

			int bits = buffer[0x23];
			bits = bits * 256 + buffer[0x22];
			at = new AudioTrack(AudioManager.STREAM_MUSIC, 44100, channel,
					AudioFormat.ENCODING_PCM_16BIT, pcmlen,
					AudioTrack.MODE_STATIC);
			at.write(buffer, 0x2C, pcmlen);
			at.play();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
