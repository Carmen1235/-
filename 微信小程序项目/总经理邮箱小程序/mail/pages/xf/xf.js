//xf.js
//获取应用实例
const app = getApp()

Page({
  //设置数据
  data: {
    isNM: '否',
    userInfo: {},
    txtLength: 0,
    disabled: false,
    array: ['贪污', '违纪', '其他'],
    sort:''
  },


 


  //预加载 获取微信昵称
  onLoad: function() {
    wx.getUserInfo({
      success: res => {
        app.globalData.userInfo = res.userInfo
        console.log(res.userInfo)
        this.setData({
          userInfo: res.userInfo,
        })
      }
    })
    //
    wx.showModal({
      title: '',
      showCancel:false,
      confirmText:"我知道了",
      content: '为了您的反馈得到及时有效的处理，请填写真实有效信息，我们讲严格保护您的隐私。',
      success: function (res) {
        if (res.confirm) {
          //console.log('用户点击确定')
        } else if (res.cancel) {
          //console.log('用户点击取消')
        }
      }
    })
  },

  //设置方法
  formSubmit: function(e) {
    console.log('form发生了submit事件，携带数据为：', e.detail.value)
    const userName = e.detail.value.userName;
    const department = e.detail.value.department;
    const telPhone = e.detail.value.telPhone;
    const question = e.detail.value.question;
    const sort = this.data.sort;
    if (sort == "") {
      wx.showModal({
        title: '',
        showCancel: false,
        confirmText: "我知道了",
        content: '请选择分类！',
        success: function (res) {
          if (res.confirm) {
            //console.log('用户点击确定')
          } else if (res.cancel) {
            //console.log('用户点击取消')
          }
        }
      })
      return;
    }
    if (userName == "") {
      wx.showModal({
        title: '',
        showCancel: false,
        confirmText: "我知道了",
        content: '请填写姓名！',
        success: function (res) {
          if (res.confirm) {
            //console.log('用户点击确定')
          } else if (res.cancel) {
            //console.log('用户点击取消')
          }
        }
      })
      return;
    }
    if (department == "") {
      wx.showModal({
        title: '',
        showCancel: false,
        confirmText: "我知道了",
        content: '请填写部门！',
        success: function (res) {
          if (res.confirm) {
            //console.log('用户点击确定')
          } else if (res.cancel) {
            //console.log('用户点击取消')
          }
        }
      })
      return;
    }
    if (telPhone==""){
      wx.showModal({
        title: '',
        showCancel: false,
        confirmText: "我知道了",
        content: '请填写联系方式！',
        success: function (res) {
          if (res.confirm) {
            //console.log('用户点击确定')
          } else if (res.cancel) {
            //console.log('用户点击取消')
          }
        }
      })
      return;
    }
    if (question == "") {
      wx.showModal({
        title: '',
        showCancel: false,
        confirmText: "我知道了",
        content: '请填写意见/建议！',
        success: function (res) {
          if (res.confirm) {
            //console.log('用户点击确定')
          } else if (res.cancel) {
            //console.log('用户点击取消')
          }
        }
      })
      return;
    }
    
    wx.request({
      url: 'https://xf.activa-leisure.com/WqyWX/ideaAdd.do', //
      data: e.detail.value,
      header: {
        'content-type': 'application/json' // 默认值
      },
      success: function(res) {
        if (res.data.state){
          wx.redirectTo({
            url: 'msg_success'
          })
        }else{
          wx.redirectTo({
            url: 'msg_fail'
          })
        }
      },
      fail: function(res) {
      }
    })
  },
  formReset: function() {
    console.log('form发生了reset事件')
  },
  //点击匿名事件
  switchChange: function(e) {
    console.log('switch1 发生 change 事件，携带值为', e.detail.value)
    if (e.detail.value) {
      this.setData({
        isNM: '是'
      })
    } else {
      this.setData({
        isNM: '否'
      })
    }

  },
  //输入意见触发事件
  bindTxt: function(e) {
    var t_txt = e.detail.value.length;
    //console.info(t_txt);
    this.setData({
      txtLength: t_txt
    })
  },
  //选择类别触发事件
  bindPickerChange: function (e) {
    //console.log('picker发送选择改变，携带值为', this.data.array[e.detail.value])
    this.setData({
      index: e.detail.value,
      sort: this.data.array[e.detail.value],
    })
  },
})