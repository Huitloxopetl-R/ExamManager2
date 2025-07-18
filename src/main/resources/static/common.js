const setSub = () => {
    const form = document.querySelector("form");
    ["japaneseHistory", "worldHistory", "geography", "physics", "chemistry", "biology"].forEach(sub => {
        const prev = form.querySelector(`input[name="${sub}"]`);
        if(prev) {
            prev.remove();
        }
    });
    const societySub = document.getElementById("societySub").value;
    const society = document.getElementById("society").value;
    if(societySub && society && society !== "") {
        const hidden = document.createElement("input");
        hidden.type="hidden";
        hidden.name = societySub;
        hidden.value = society;
        form.appendChild(hidden);
    }
    const scienceSub = document.getElementById("scienceSub").value;
    const science = document.getElementById("science").value;
    if(scienceSub && science && science !== "") {
        const hidden = document.createElement("input");
        hidden.type="hidden";
        hidden.name = scienceSub;
        hidden.value = science;
        form.appendChild(hidden);
    }
};

const confirmDelete = (form) => {
    console.log("test");
    const name = form.querySelector("[name='exName']").value;
    const date = form.querySelector("[name='exDate']").value;
    return window.confirm(`${name}さんの${date}の試験データを削除しますか\nよろしいですか`);
};

document.addEventListener('DOMContentLoaded', setSub);
document.querySelector("form").addEventListener("submit", (e) => setSub());