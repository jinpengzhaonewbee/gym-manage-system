let noticeList = document.querySelector('#noticeList');
let noticeTitle = document.querySelector('#noticeTitle');
let addBtn = document.querySelector('#addBtn');

// 初始化公告列表
let notices = [
    { id: 1, title: '中国国家图书馆免费向公众开放' },
    { id: 2, title: '「超级计算」展览在上海开幕' },
    { id: 3, title: '广州交通公安开通网上违停申诉服务' }
];

render();

// 渲染公告列表
function render() {
    noticeList.innerHTML = '';
    notices.forEach(function(notice) {
        let li = document.createElement('li');
        li.innerHTML = `${notice.title} <button data-id="${notice.id}">删除</button>`;
        noticeList.appendChild(li);
    });
}

// 添加公告
addBtn.addEventListener('click', function() {
    let title = noticeTitle.value.trim();
    if (title === '') {
        alert('请输入公告标题');
        return ;
    }
    let id = notices.length + 1;
    notices.push({ id: id, title: title });
    noticeTitle.value = '';
    render();
});

// 删除公告
noticeList.addEventListener('click', function(event) {
    let target = event.target;
    if (target.tagName.toLowerCase() === 'button') {
        let id = parseInt(target.getAttribute('data-id'));
        notices = notices.filter(notice => notice.id !== id);
        render();
    }
});
